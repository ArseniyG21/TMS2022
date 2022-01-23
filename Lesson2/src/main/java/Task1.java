public class Task1 {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(4, 67));
        System.out.println(calculateHypotenuse(22, 43));

    }

    private static void printLiterals() {
//        вывести на консоль литералы следующих видов:
//        логический:
        boolean test = 6 < 4;
        {
            System.out.println(test);
        }

//        строковый:
        String str1 = "\n\tLesson2-HomeWork";
        System.out.println(str1);
//        символьный:
        char firstElement = 'A';
        System.out.println(firstElement);

//        целочисленный 2-й:
        short secondElement = 0b100000000; //256
        System.out.println(secondElement);
//        целочисленный 8-й:
        int thirdElement = 0400; //256
        System.out.println(thirdElement);
//        целочисленный 10-й:
        int fiveElement = 256; //256
        System.out.println(fiveElement);
//        целочисленный 16-й:
        int sixElement = 0x100; //256
        System.out.println(sixElement);

//        литерал типа float
        float sevenElement = 256.1F;
        System.out.println(sevenElement);
//        литерал типа double.
        double eightElement = 256.123987;
        System.out.println(eightElement);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        return a + b;
        if (sum(a, b) > Integer.MAX_VALUE) {
            return -1;
        }


        /**
         * Метод должен вернуть максимальное значение из двух чисел
         *
         * <p>
         * Example1:
         * a = 4,
         * b = 5
         * <p>
         * Метод должен вернуть 5
         * Example2:
         * a = 10,
         * b = 10
         * <p>
         * Метод должен вернуть 10
         */
        public static int max ( int a, int b){
            if (a > b) {
                return a;
            } else {
                return b;
            }

        }

        /**
         * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
         * <p>
         * Example1:
         * 3
         * 4
         * return 5
         * <p>
         * Example2:
         * 12
         * 16
         * return 20
         */
        public static double calculateHypotenuse ( int a, int b){
            return Math.sqrt(a * a + b * b);
        }
    }


