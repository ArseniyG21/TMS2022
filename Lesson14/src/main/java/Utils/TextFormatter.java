package Utils;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@UtilityClass
public class TextFormatter {
    private static final String SPLIT_SENTENCES_REGEX = "(?<=[?.!])(\\s*)";
    private static final Pattern WORDS_FIND = Pattern.compile("[\\wА-Яа-я]+");
    private static final Pattern HYPHEN_FIND = Pattern.compile("(?<=[\\wа-яА-Я])-[$\\r\\n]+(?=[\\wа-яА-Я])");

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


    public static List<String> getSentences(String text) {
        List<String> strings = Arrays.asList(text.split(SPLIT_SENTENCES_REGEX));
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            Matcher matcherSentence = HYPHEN_FIND.matcher(string);
            result.add(matcherSentence.replaceAll(""));
        }
        return result;
    }

    public static boolean isPalindrome(String string) {
        if (string.length() > 2) {
            StringBuilder sb = new StringBuilder(string);
            return string.equalsIgnoreCase(sb.reverse().toString());
        } else return false;
    }

    public static int getCountWords(String string) {
        return getWordsFromString(string).size();
    }

    public static boolean findPalindrome(String string) {
        for (String word : getWordsFromString(string)) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> getWordsFromString(String string) {
        Matcher matcherWords = WORDS_FIND.matcher(string);
        ArrayList<String> words = new ArrayList<>();
        words.add(String.valueOf(words));
        return WORDS_FIND.matcher(string)
                .results()
                .map(MatchResult::group)
                .collect(Collectors.toList());
    }
}