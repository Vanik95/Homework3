package com.company;

import java.util.Scanner;

public class Homework29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int number2 = scanner.nextInt();
        int number1FirstDigit = number1 / 10;
        int number1SecondDigit = number1 % 10;
        int number2FirstDigit = number2 / 10;
        int number2SecondDigit = number2 % 10;

        if (number1 >= 25 && number2 <= 75 && number1 <= 75 && number2 >= 25) {

            if (number1FirstDigit == number2FirstDigit) {
                System.out.println("True");
            } else if (number1FirstDigit == number2SecondDigit) {
                System.out.println("True");
            } else if (number1SecondDigit == number2FirstDigit) {
                System.out.println("True");
            } else if (number1SecondDigit == number2SecondDigit) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("The number or numbers are not from [25 ; 75] diapason.");
        }
    }
}