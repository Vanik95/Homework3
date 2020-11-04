package com.company;

import java.util.Random;

public class Homework22 {

    public static void main(String[] args) {

        Random random = new Random();
        int number1 = random.nextInt(90) + 10;
        int number2 = random.nextInt(90) + 10;

        if (number1 * number2 % 2 == 0) {
            long number3 = (long) (number1 * number2);
            System.out.println("Even - " + number3);
        } else if (number1 * number2 % 2 == 1) {
            double number4 = (double) (number1 * number2);
            System.out.println("Odd - " + number4);
        }
    }
}