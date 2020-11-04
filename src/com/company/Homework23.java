package com.company;

import java.util.Random;

public class Homework23 {

    public static void main(String[] args) {

        Random random = new Random();
        int number = (int) Math.pow(random.nextInt(90) + 10, 2);
        String text = String.valueOf(number);
        System.out.println(text);
    }
}