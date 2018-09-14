package com.java24hours;

class Virus {
    static int virusCount = 1; //this is a class variable b/c static
    
    public Virus() { //helper class, so inner class of Virus
        virusCount++; //this is a class avriable so it can be aminpulated
        
    }
    
    static int getVirusCount() {
        return virusCount;
    }
    
    static int newSeconds() {
        int newSeconds = 61;
        if(newSeconds < 60 || newSeconds < 100) {
            System.out.println(newSeconds); 
        }else {
              System.out.println("There are no new seconds");
            }
        return 0; 
    }
}
