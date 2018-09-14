package com.java24hours;

class Nines {
    public static void main(String[] arguments) {
          int dex;
        for(dex = 1; dex <= 400; dex++) {
        int multiple  = 13 * dex;
        System.out.print(multiple + " " );
        }
        System.out.println();
        
        /*int limit = 5;
        int count = 1;
        while (count < limit) {
        System.out.println("Pork is not a verb");
        count++;*/
        
        /* int limit = 6;
        int count = 6;
        do {
        System.out.println("I am not allergic to long division");
        count++;
        } while (count < limit)
    }*/
        /*String quitKeyPressed = "E";
        
        while(true) {
        if(quitKeyPressed.contains(quitKeyPressed) == true) {
        break;
        }
    }
    
    }*/
        
        /* int points = 0;
        int target = 100;
        targetLoop: //name the outerloop to be able to break the loops
        while(target <= 100) {
        for(int i = 0; i < target; i++) {
        if (points > 50 ) {
        break targetLoop;
        }
        points =points + 1;
        }
        }*/
       
    }
}