package com.java24hours;

class PlanetWeight {
    public static void main(String[] arguments) {
        System.out.print("Your weight on Earth is: ");
        double weight = 178;
        System.out.println(weight);
        
        System.out.println("Your weight on Mercury is: ");
        double mercury = weight * 0.378;
        System.out.println(mercury);
        
        System.out.println("Your weight on the Moon is: " );
        double moon = weight * 0.166;
        System.out.println(moon);
        
        System.out.println("Your weight on Jupiter is: ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}