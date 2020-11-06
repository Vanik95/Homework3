package com.company;

import java.util.Scanner;

public class Homework311 {

    public static void main(String[] args) {

        System.out.println("Input the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                System.out.println("False");
            } else if (number % i != 0){
                System.out.println(number + " is a prime number");
            } break;
        }
    }
}