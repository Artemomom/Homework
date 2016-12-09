package Homework.Task3;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main (String Args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any text and separate sentences with dots (.): ");
        String anyText = scan.nextLine();
        String[] allSentences = anyText.split("[\\.\\!\\?]");

        String words[][] = new String[allSentences.length][];
        for (int i = 0; i < allSentences.length; ++i) {
            words[i] = allSentences[i].split(" ");
        }
        int max = words[0].length;
        int kek = 0;
        for (int i = 1; i < words.length; ++i) {
            if (words[i].length > max) {
                max = words[i].length;
                kek = i;
            }
        }
        System.out.println("Количество предложений в строке : " + allSentences.length);
        System.out.println("Самое большое предложение: " + allSentences[kek]);
        max = 0;
        kek = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j].length() > max) {
                    max = words[i][j].length();
                    kek = i;
                }
            }
        }
        System.out.println("Предложение с самым большим словом: " + allSentences[kek]);
    }
}



