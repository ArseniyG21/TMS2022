
import Utils.TextFormatter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static Utils.Constants.*;
import static Utils.TextFormatter.isPalindrome;

public class Main {

    public static void main(String[] args) throws IOException {

//        1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
//        После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE));
             BufferedWriter bw = new BufferedWriter(new FileWriter("Lesson14/src/main/resources/output.txt"))) {
            String text;

            while ((text = br.readLine()) != null) {
                if (isPalindrome(text)) {
                    bw.write(text + "\n");
                    bw.flush();
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        //    2)Текстовый файл hw2/input.txt содержит текст.
//    После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
//    Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
//    Пишем все в ООП стиле. Создаем класс Utils.TextFormatter
//    в котором два метода:
//    1. Метод принимает строку и возвращает кол-во слов в строке.
//    2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//    В main считываем файл.
//    Разбиваем текст на предложения. Используя методы класса Utils.TextFormatter определяем подходит ли нам предложение.
//    Если подходит добавляем его в output.txt файл

        String text = Files.readString(Path.of(INPUT2_FILE));

        List<String> sentences = TextFormatter.getSentences(text);
        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            int numberOfWords = TextFormatter.getCountWords(sentence);
            if (numberOfWords >= 3 && numberOfWords <= 5 || TextFormatter.findPalindrome(sentence)) {
                filteredSentences.add(sentence);
            }
        }

        Files.write(Path.of(OUTPUT_FILE), filteredSentences);
    }
}

//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT2_FILE));
//             PrintStream printStream = new PrintStream(OUTPUT_FILE)) {
//
//            String text;
//            while ((text = bufferedReader.readLine()) != null) {
//                String deleteSpaces = text.replaceAll("\\R", "");
//                String[] splitSentences = deleteSpaces.split("[.!?]");
//                for (String sentences : splitSentences) {
//                    printStream.print(sentences + "\n");
//                }
//            }
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    public static boolean isPalindrome(String str) {
//        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
//    }

