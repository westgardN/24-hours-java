package com.java24hours;


class FunWithThreads {
    public static void main(String[] arguments) {
        try{ 
            Thread.sleep(5000);
            
        }catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}