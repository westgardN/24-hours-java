package com.java24hours;

//CableMOdem is a sub class of the super class Modem
class CableModem extends Modem {
    String method = "cable connection";
    
    public void connect() {
        System.out.println("Connecting to the Internet....");
        System.out.println("Using a " + method);
    }
     public void disconnect() {
        //System.out.println("Disconnecting....."
        // + method );
    }
}