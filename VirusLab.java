package com.java24hours;

public class VirusLab {
    public static void main(String[] arguments) {
        int numViruses = Integer.parseInt(arguments[0]);
        if(numViruses > 0);
            Virus[] virii = new Virus[numViruses];//a new array to hold the number of viruses
            for(int i = 0; i <numViruses; i++) {
                virii[i] = new Virus();
            }
            System.out.println("There are " + Virus.getVirusCount() + " viruses" );
            System.out.println(Virus.newSeconds());
    }
}
