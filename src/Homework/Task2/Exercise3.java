package Homework.Task2;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any length of array: ");
        int countString = Integer.parseInt(x.readLine());
        String veryShortString = null;

        for ( int i = 0; i < countString; i++) {
            System.out.println(String.format("Please enter the row #%d: ", i + 1));
            String currentString = x.readLine();
            if (veryShortString == null || currentString.length() < veryShortString.length()) {
                veryShortString = currentString;
            }
        }
            System.out.println("The shortest string is = " + veryShortString);
            System.out.println("Her length is = " + veryShortString.length() + " symbols");

    }
}
