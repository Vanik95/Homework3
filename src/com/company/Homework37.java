package com.company;

public class Homework37 {

    public static void main(String[] args) {

        int sum = 0;
        int quantity = (100 - 1 + 1) / 2;

        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("The average is " + sum / quantity);
    }
}