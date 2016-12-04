package Homework;

import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Arrays;

public class Exercise2 {

    public static final int kInputLimit = 3;

    public static void main(String[] args) {

        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int number = 0;
        while (number++ < kInputLimit) {
            int currentInput = sc.nextInt();
            if(max1 > max2)
                max2 = Math.max(currentInput, max2);
            else
                max1 = Math.max(currentInput, max1);
        }

        System.out.println("max1: " + max1 + " max2: " + max2 + " square sum of 2 max: " + (max1*max1+max2*max2));

    }
}