package com.company;

import java.util.Random;

public class Homework21 {

    public static void main(String[] args) {

        Random random = new Random();
        int number1 = random.nextInt(90) + 10;
        int number2 = random.nextInt(90) + 10;
        long number3 = (long) (number1 + number2);
        System.out.println(number3);
    }
}