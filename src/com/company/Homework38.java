package com.company;

import java.util.Scanner;

public class Homework38 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        System.out.println("Input 10 numbers : ");

        for (int i = 0; i < 10; i++) {
            numbers = scanner.nextInt();
            sum += numbers;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The Average is " + sum / 10);
    }
}