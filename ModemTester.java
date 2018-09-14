package com.java24hours;

public class ModemTester {

    private static String method;
    
    public static void main(String[] arguments) {
        CableModem surfBoard = new CableModem();//new Cable Modem object created
        DslModem gateway = new DslModem();//new DslModem object created
        AcousticModem soundTown  = new AcousticModem();
        
        surfBoard.speed = 500000;
        gateway.speed = 400000;
        soundTown.speed = 600000;
        
        System.out.println("Trying the Cable Modem:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println(" \n");
        
        System.out.println("Trying the DSL Modem:");
        gateway.displaySpeed();
        gateway.connect();
        System.out.println(" \n");
        
        System.out.println("Trying the Acoustic Modem:");
        soundTown.displaySpeed();
        soundTown.connect();
        System.out.println(" \n");
        
        soundTown.disconnect(soundTown.method + "\n");
        gateway.disconnect(gateway.method + "\n");
        surfBoard.disconnect(soundTown.method + "\n");
        
    }
    
    
}
