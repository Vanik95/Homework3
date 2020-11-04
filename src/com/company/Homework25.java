package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number1 = random.nextInt();
        int number2 = random.nextInt();
        System.out.println("Please enter an operator");
        char operator = scanner.next().charAt(0);
        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int product = number1 * number2;
        int division = number1 / number2;

        switch (operator) {
            case '+':
                System.out.println(sum);
                break;
            case '-':
                System.out.println(subtraction);
                break;
            case '*':
                System.out.println(product);
                break;
            case '/':
                System.out.println(division);
                break;
            default:
        }
    }
}