public class Homework {

    public static void main(String[] args) {

//      1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).

        StringBuilder string = new StringBuilder("Работа со строкамиВ");
        int indexA = string.indexOf("а");
        int indexB = string.lastIndexOf("В");
        System.out.println(string.substring(indexA, indexB));

//      2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0

        String str = "Summer, winter, autumn, spring!";
        String str1 = str.replace(str.charAt(0), str.charAt(3));
        System.out.println(str1);

        String str2 = str.replace(str.substring(0, 1), str.substring(3, 4));
        System.out.println(str2);

        string.replace(3, 4, string.substring(0, 1));
        System.out.println(string);

//     3) В массиве находятся слова. Вывести на экран слова палиндромы
//     (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)

        String[] palindromes = {"заказ", "рыба", "казак", "лед", "автомобиль", "дед", "или", "иди"};

        for (String palindrome : palindromes) {

            StringBuilder palindrome1 = new StringBuilder(palindrome);
            if (palindrome1.reverse().toString().equals(palindrome)) {
                System.out.println(palindrome);
            }
        }

        String text1 = "Java — строго типизированный объектно-ориентированный язык. Казак, тот, иди, заказ. Программирования " +
                "общего назначения, разработанный компанией Sun Microsystems (в последующем приобретённой " +
                "компанией Oracle). Разработка иди ведётся сообществом, организованным через Java Community Process; " +
                "язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую " +
                "марку принадлежат корпорации Oracle. Это предложение содержит пять слов. Один два три. Раз, два, три, четыре. " +
                "Или, тот, казак, заказ.";

        filterText(text1);

        //     4) Есть строка в которой содержится текст, предложения разделены точками.
//     После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
//     Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
//     Пишем все в ООП стиле.
//     1. Метод принимает строку и возвращает кол-во слов в строке.
//     2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//     В main создаем строку с текстом, также можно текст задавать с консоли.
//     Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//     Если подходит, то выводим на экран.


        //     5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
//     Пример: "string" → "ri", "code" → "od", "Practice"→"ct".

        String[] strings = {"string", "code", "Practice", "level", "java", "developer"};

        for (String str0 : strings) {
            if (str0.length() % 2 == 0) {
                System.out.println(str0.substring(str0.length() / 2 - 1, str0.length() / 2 + 1));
            }
        }
    }

    public static void filterText(String text) {
        String[] strings = text.split("\\.\\s*");
        for (String string : strings) {
            String[] arrayOfWordsFromString = string.split("[\\s,*;*(*)*]+");


            if (arrayOfWordsFromString.length >= 3 && arrayOfWordsFromString.length <= 5) {
                System.out.println("----------------------------------------------------------\nСтрока:");
                System.out.println(string + ".");
                System.out.println("Количество слов в строке: " + string.split("[\\s,*;*(*)*]+").length);
            }

            for (String word : arrayOfWordsFromString) {
                StringBuilder palindromeOn = new StringBuilder(word);
                if (palindromeOn.reverse().toString().equals(word)) {
                    System.out.println("Строка с палиндромом: " + string);
                    break;
                }
            }
        }
    }
}


