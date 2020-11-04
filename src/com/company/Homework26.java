package com.company;

import java.util.Scanner;

public class Homework26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the week number");
        int weekNumber = scanner.nextInt();

        switch (weekNumber) {
            case 1:
                System.out.println(weekNumber + " - monday");
                break;
            case 2:
                System.out.println(weekNumber + " - tuesday");
                break;
            case 3:
                System.out.println(weekNumber + " - wednesday");
                break;
            case 4:
                System.out.println(weekNumber + " - thursday");
                break;
            case 5:
                System.out.println(weekNumber + " - friday");
                break;
            case 6:
                System.out.println(weekNumber + " - saturday");
                break;
            case 7:
                System.out.println(weekNumber + " - sunday");
                break;
            default:
                System.out.println("That is not a week day.");
        }
    }
}