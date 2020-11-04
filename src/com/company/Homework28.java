package com.company;

import java.util.Scanner;

public class Homework28 {

    public static void main(String[] args) {

        int radius = 5;
        double area = Math.PI * Math.pow(radius, 5);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("------------ MENU ------------");
        System.out.println("-- enter 1 for calculating area of the circle");
        System.out.println("-- enter 2 for calculating perimeter of the circle");
        System.out.println("-- enter 3 for exit");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("Area is " + area);
                break;
            case 2:
                System.out.println("Perimeter is " + perimeter);
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Please try again");
        }
    }
}