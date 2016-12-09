package Homework.Task2;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Exercise4 {
//    public static void main(String[] Args) throws Exception {
//        Scanner x = new Scanner(System.in);
//        System.out.println("Enter any length of array: ");
//        int size = x.nextInt();
//        String[] strings = new String[size];
//        //int[] stringsLength = new int[size];
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(String.format("Please enter the row #%d: ", i + 1));
//            strings[i] = x.nextLine();
//            //stringsLength[i] = strings[i].length();
//        }
//        float average_length = 0.0f;
//        for (String any : strings ) {
//            average_length += (float) any.length();
//            //average_length /= strings.length;
//        }
//        average_length /= strings.length;
//
//        System.out.println("Strings with length smaller then average (" + average_length + "):");
//
//
//    }

        public static void main (String[] args) throws java.lang.Exception
        {
            String[] inputs;

            try {
                inputs = ScanStrings();
            }
            catch (InputMismatchException e) {
                System.err.print("Вы ввели не число. " );
                return;
            }

            PrintLowAverageLengthStrings(inputs);
        }

        private static String[] ScanStrings() {
            String[] inputs = null;

            System.out.println("Введите число строк: ");

            try (Scanner scanner = new Scanner(System.in)) {
                int n = scanner.nextInt();
                scanner.nextLine();

                inputs = new String[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Введите строку №" + (i + 1) + ": ");
                    inputs[i] = scanner.nextLine();
                }
            }

            return inputs;
        }

        private static void PrintLowAverageLengthStrings(String[] inputs) {
            float average_length = 0;

            for (String item : inputs) {
                average_length += (float) item.length();
            }

            average_length /= inputs.length;

            System.out.println("Строки с длиной меньше средней (" + average_length + "):");

            for (String item : inputs) {
                if (item.length() < average_length) {
                    System.out.println("'" + item + "' с длиной " + item.length());
                }
            }
        }
    }