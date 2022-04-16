package Classes;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Calculator {

//         4)Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
//         subtraction. Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция.

    public static <T extends Number, E extends Number> double sum(T type1, E type2) {
        return type1.doubleValue() + type2.doubleValue();
    }

    public static <T extends Number, J extends Number> double multiply(T type1, J type2) {
        return type1.doubleValue() * type2.doubleValue();
    }

    public static <T extends Number, E extends Number> double divide(T type1, E type2) {
        if (type2.doubleValue() == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        } else {
            return type1.doubleValue() / type2.doubleValue();
        }
    }

    public static <T extends Number, E extends Number> double subtraction(T type1, E type2) {
        return type1.doubleValue() - type2.doubleValue();
    }
}

