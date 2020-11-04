package com.company;

import java.util.Scanner;

public class Homework27 {

    public static void main(String[] args) {

        System.out.println("Please enter the month name");
        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.nextLine();

        switch (monthName) {
            case "january":
                System.out.println("January");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "february":
                System.out.println("February");
                for (int i = 1; i <= 28; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "march":
                System.out.println("March");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "april":
                System.out.println("April");
                for (int i = 1; i <= 30; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "may":
                System.out.println("May");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "june":
                System.out.println("June");
                for (int i = 1; i <= 30; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "july":
                System.out.println("July");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "august":
                System.out.println("August");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "september":
                System.out.println("September");
                for (int i = 1; i <= 30; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "october":
                System.out.println("October");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "november":
                System.out.println("November");
                for (int i = 1; i <= 30; i++) {
                    System.out.print(i + " ");
                }
                break;
            case "december":
                System.out.println("December");
                for (int i = 1; i <= 31; i++) {
                    System.out.print(i + " ");
                }
                break;
            default:
                System.out.println("That is not a month name.");
        }
    }
}