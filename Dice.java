package com.java24hours;

import java.util.Random;


class Dice {
    public static void main(String[] arguments) {
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("The Random number is: " + value);
    }
}