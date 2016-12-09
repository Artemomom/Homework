package Homework.Task3;
import java.io.InputStream;
import java.text.DateFormatSymbols;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;

public class Exercise2 {
    public static int countDifferentSymbolsInWord(String word) {
        char[] wordChars = word.toCharArray();
        int result = 0;
        for (int i = 1; i < wordChars.length; i++) {
            if (wordChars[0] != wordChars[i]) {
                result++;
            }
        }
        return result;
    }

    public static List<String> findWords(String[] sourceStrings) {
        Pattern wordPattern = Pattern.compile("[а-яa-z]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceStrings) {
            Matcher wordMatcher = wordPattern.matcher(word.toLowerCase());
            if (wordMatcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }

    public static void findWordWithMinDifferentSymbols(String[] sourceWords) {
        final String message = "Слово, в котором число различных символов минимально (число различных символов): ";
        if (sourceWords.length == 0) {
            System.out.println(message + "Нет слов");
            return;
        }
        String result = sourceWords[0];
        for (int i = 1; i < sourceWords.length; i++) {
            if (countDifferentSymbolsInWord(result) > countDifferentSymbolsInWord(sourceWords[i])) {
                result = sourceWords[i];
            }
        }
        System.out.println(message + result + "(" + countDifferentSymbolsInWord(result)
                + ")");
    }

}
