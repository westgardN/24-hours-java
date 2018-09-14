package com.java24hours;

//super class
class Modem {
    int speed;
    
    public void displaySpeed(){
        System.out.println("Speed: " + speed);
    }
    
    public void disconnect(String method) {
        System.out.println("Disconnecting ..." + method);
    }
}