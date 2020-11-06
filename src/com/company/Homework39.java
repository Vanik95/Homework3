package com.company;

import java.util.Scanner;

public class Homework39 {

    public static void main(String[] args) {

        System.out.println("input the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println("Number is : " + i + " and cube of the " + i + " is : " + Math.pow(i, 3));
        }
    }
}