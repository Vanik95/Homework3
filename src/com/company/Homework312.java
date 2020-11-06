package com.company;

import java.util.Scanner;

public class Homework312 {

    public static void main(String[] args) {

        System.out.println("Input the number");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number = scanner.nextInt();
        int member1 = 0;
        int member2 = 1;
        System.out.print("Here is the Fibonacci series up to " + number + " terms: ");

        while (i < number) {
            i++;
            System.out.print(member1 + " ");
            int sum = member1 + member2;
            member1 = member2;
            member2 = sum;
        }
    }
}