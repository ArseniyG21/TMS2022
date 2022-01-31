import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {                 // проверка целое ли число
            if (scanner.nextInt() % 2 == 0) {
                System.out.println("четное");
            } else {
                System.out.println("не четное");
            }
        } else {
            System.out.println("ошибка");
        }

        Scanner scanner1 = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();

        double absA = Math.abs(first);
        double absB = Math.abs(second);
        double absC = Math.abs(third);

        double D = min(absA, absB);
        System.out.println(Math.min(D, absC));

        int random = (int) (Math.random() * 28801);
        int hours = random / 3600;
        int remainder = random % 3600;
        System.out.println(random + " секунд");
        System.out.println("Осталось: " + hours + "часов");

        if (remainder == 0) {                                      // я понимаю, что можно сделать через switch
            System.out.println("осталось 8 часов");
        } else if (remainder > 0 && remainder < 3601) {
            System.out.println("Осталось: " + hours + "часов");
        } else if (remainder > 3600 && remainder < 7201) {
            System.out.println("Осталось: " + hours + "часов");
        } else if (remainder > 7200 && remainder < 10801) {
            System.out.println("Осталось: " + hours + "часов");
        } else if (remainder > 10800 && remainder < 14401) {
            System.out.println("Осталось: " + hours + "часов");
        } else if (remainder > 14400 && remainder < 18000) {
            System.out.println("Осталось: " + hours + "часов");
        } else if (remainder > 18000 && remainder < 21601) {
            System.out.println("Осталось: " + hours + "часов");
        } else if (remainder > 21600 && remainder < 25201) {
            System.out.println("Осталось: " + hours + "часов");
        } else if (remainder > 25200 && remainder < 28801) {
            System.out.println("Осталось менее часа");
        }


        System.out.println("    byte short char int long float double boolean");
        System.out.println("byte  т    ня    я   ня   ня   ня    ня      х");
        System.out.println("short я    т     я   ня   ня   ня    ня      х");
        System.out.println("char  я    я     т   ня   ня   ня    ня      х");
        System.out.println("int   я    я     я   т    ня   ня    ня      х");
        System.out.println("long  я    я     я   я    т    ня    ня      х");
        System.out.println("float я    я     я   я    я    т     ня      х");
        System.out.println("double я   я     я   я    я    я     т       х");
        System.out.println("boolean х  х     х   х    х    х     х       т");

    }

    private static double min(double absA, double absB) {
        return absA < absB ? absA : absB;
    }

    public static double average(int[] array) {
        double count = 0;
        for (int value : array) {
            count = count + value;
        }
        return count / array.length;
    }

//    public static int max(int[] array) {                            //Максимадбный элемент массива не понимаю как найти.
//        if (array != null) {                                        Это ваш код. Понимаю, что если массив не пустой, тогда
//            int max = Integer.MIN_VALUE;                            переменной max присваевается наименьшее интовое значение,
//            for (int value : array) {                               но зачем? Дальше проходим по массиву, и max присваеваем
//                if (value > max) {                                  value, но что такое value?
//                    max = value;
//                }
//            }
//            return max;
//        } else {
//            return Integer.MIN_VALUE;
//        }
//    }
}