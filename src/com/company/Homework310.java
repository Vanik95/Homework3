package com.company;

import java.util.Scanner;

public class Homework310 {

    public static void main(String[] args) {

        System.out.println("Input the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}