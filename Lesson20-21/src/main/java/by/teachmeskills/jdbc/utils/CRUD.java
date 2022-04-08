package by.teachmeskills.jdbc.utils;

import by.teachmeskills.jdbc.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUD {
    private static String GET_ALL_PRODUCTS_QUERY = "SELECT * FROM products";
    private static String INSERT_PRODUCT_QUERY = "INSERT INTO products(name, description, price, amount, isStock) VALUES(?, ?, ?, ?, ?);";
    private static String UPDATE_PRODUCT_QUERY = "UPDATE products SET isStock = ? WHERE amount = ?;";
    private static String DELETE_PRODUCT_QUERY = "DELETE FROM products WHERE amount = ?";

    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCTS_QUERY);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int amount = rs.getInt("amount");
                boolean isStock = rs.getBoolean("isStock");
                products.add(new Product(id, name, description, price, amount, isStock));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return products;
    }

    public static List<Product> saveProduct(Product product) {
        List<Product> updatedProducts = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_QUERY);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getAmount());
            preparedStatement.setBoolean(5, product.isStock());
            preparedStatement.executeUpdate();

            updatedProducts = getAllProducts();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedProducts;
    }

    public static List<Product> updateProduct(boolean isStock, int amount) {
        List<Product> updatedProducts = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_QUERY);
            preparedStatement.setBoolean(1, isStock);
            preparedStatement.setInt(2, amount);
            preparedStatement.executeUpdate();

            updatedProducts = getAllProducts();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedProducts;
    }

    public static List<Product> deleteProduct(int amount) {
        List<Product> updatedProducts = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_QUERY);
            preparedStatement.setInt(1, amount);
            preparedStatement.execute();

            updatedProducts = getAllProducts();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedProducts;
    }
}
