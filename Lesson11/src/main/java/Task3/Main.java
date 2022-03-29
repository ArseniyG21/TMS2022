package Task3;


public class Main {
    public static void main(String[] args) {

        Skirt skirt = new Skirt(Main.ClothesSize.S, 45.4, "red");
        Tshirt tshirt = new Tshirt(Main.ClothesSize.L, 12, "blue");
        Trousers trousers = new Trousers(Main.ClothesSize.M, 56.7, "yellow");
        Tie tie = new Tie(Main.ClothesSize.XS, 34.94, "black");

        Clothes[] clothes = {skirt, tshirt, trousers, tie};
        Clothes[] clothes1 = {skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes1);
        atelier.dressWoman(clothes1);

        ClothesSize[] clothesSizes = ClothesSize.values();
        for (ClothesSize clothesSize : clothesSizes) {
            System.out.println(clothesSize);
            clothesSize.getDescription();
        }
    }
//    Задача3: Одежда
//
//      1) Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
//      Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
//      Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
//      Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому размеру.
//      Создать конструктор, принимающий на вход euroSize.
//      2) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
//      3) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
//      4) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
//      Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
//      Галстук (реализует интерфейсы "Мужская Одежда").
//      5) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
//      одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
//      Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.

    enum ClothesSize {
        XXS(32) {
            @Override
            public void getDescription() {
                System.out.println("Детский размер");
            }
        },
        XS(34) {
            @Override
            public void getDescription() {
                super.getDescription();
            }
        },
        S(36) {
            @Override
            public void getDescription() {
                super.getDescription();
            }
        },
        M(38) {
            @Override
            public void getDescription() {
                super.getDescription();
            }
        },
        L(40) {
            @Override
            public void getDescription() {
                super.getDescription();
            }
        };

        private int euroSize;

        public void getDescription() {
            System.out.println("Взрослый размер");
        }

        ClothesSize(int euroSize) {
            this.euroSize = euroSize;
        }
    }

}
