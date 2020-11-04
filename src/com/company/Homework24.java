package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter the number");
        int number1 = scanner.nextInt();

        if (number1 > 100) {
            int number2 = random.nextInt(number1 - 50) + 50;
            String text1 = String.valueOf(number2);
            System.out.println(text1);
        } else if (number1 < 100) {
            int number3 = random.nextInt(50);
            String text2 = String.valueOf(number3);
            System.out.println(text2);
        } else {
            System.out.println("The number is 100.");
        }
    }
}