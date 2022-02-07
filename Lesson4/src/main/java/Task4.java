import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

        Random random = new Random();
        int randomValue = random.nextInt(7) + 1;
        switch (randomValue) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6, 7:
                System.out.println("Выходной");
                break;
        }
//
//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int am = 1;
        for (int i = 1; i < 24; i += 3) {
            System.out.println(am *= 2);
        }

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        numCheck();
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(779);
        countDevs(861);
        countDevs(29);
        foobar(6);
        foobar(10);
        foobar(15);

    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */


    //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    private static void numCheck() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numCheck = (int) Math.log10(num) + 1;
        if (num > 0) {
            System.out.println(" - это положительное число, количество цифр: " + numCheck);
        } else if (num < 0) {
            System.out.println(" - это отрицательное число, количество цифр: " + numCheck);
        } else {
            System.out.println("Вы ввели 0.");
        }


        Scanner scan = new Scanner(System.in);              //Ошибка, выход за пределы массива
        Random random = new Random();
        System.out.println("Введите размер массива");
        int valueOfArray = scan.nextInt();
        int[] array = new int[valueOfArray];
        for (int i = Integer.MIN_VALUE; i < valueOfArray; i++) {
            array[i] = random.nextInt(valueOfArray);
            System.out.print(array[i]);
        }

    }

    private static void printArray() {
        // тут пишем логику
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            if (scanner.hasNext()) {
                count = scanner.nextInt();
            } else {
                System.out.println("Ошибка");
                scanner.next();
            }
        } while (count <= 0);

    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        // тут пишем логику

        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else if (number == 0) {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        int count = 0;
        for (int i : ints) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */

    public static void countDevs(int count) {

//        ов, та, т

        if ((count % 2 == 0 && count % 3 == 0) || (count % 3 == 0 && count % 4 == 0)                             //нет больше вариантов решения
                || count % 7 == 0 || count % 8 == 0 || count % 9 == 0) {
            System.out.println(count + " программистов");
        }
        if (count % 3 == 0 && count / 3 == 1) {
            System.out.println(count + " программиста");
        } else if (count % 3 == 0 && count % 7 == 0 || count % 10 == 1) {
            System.out.println(count + " программист");
        } else if (count % 7 == 0 || count % 8 == 0 || count % 9 == 0 || count / 1 == count && count / count == 1) {
            System.out.println(count + " программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */

    public static void foobar(int number) {
        // тут пишем логику
        if (number % 3 == 0) {
            System.out.println("foo");
        }
        if (number % 5 == 0) {
            System.out.println("bar");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        }
    }
}


