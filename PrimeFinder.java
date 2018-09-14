package com.java24hours;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PrimeFinder extends JFrame implements Runnable, ActionListener {
    Thread go;
    JLabel howManyLabel;
    JTextField howMany;
    JButton display;
    JTextArea primes;
    
    //inner class
    public PrimeFinder() { //dont call new here creating an object causes it to run
        super("Find Prime Numbers");
        setLookAndFeel();
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        
        howManyLabel = new JLabel("Quantity: ");
        howMany = new JTextField("400", 10);
        display = new JButton("Display primes");
        primes = new JTextArea(8, 40);
        
        display.addActionListener(this);
        JPanel topPanel = new JPanel();
        topPanel.add(howManyLabel);
        topPanel.add(howMany);
        topPanel.add(display);
        add(topPanel, BorderLayout.NORTH);
        
        primes.setLineWrap(true);
        JScrollPane textPane = new JScrollPane(primes);
        add(textPane, BorderLayout.CENTER);
        
        setVisible(true);    
        
    }
    //if the "go" thread has the object variable of null, it indicates the thread has not been created yet
public void actionPerformed(ActionEvent event) {
    display.setEnabled(false);
    if (go == null) {
        go = new Thread(this);
        go.start();//causes the run() method of PrimeFinder class to be called ..
        
    }
}

public void run() {
    int quantity = Integer.parseInt(howMany.getText());
    int numPrimes = 0;
    
    //candidate the number that might be prime
    int candidate =2;
    primes.append("First " + quantity + "Primes: ");
    while(numPrimes < quantity) {
        if(isPrime(candidate)) {
            primes.append(candidate + " ");
            numPrimes++;
        }
        candidate++;
    }
}
public static boolean isPrime(int checkNumber) {
    double root = Math.sqrt(checkNumber);
    for(int i =2; i <= root; i++) {
        if(checkNumber % i == 0) {
            return false;
        }
    }
    return true;
}
private void setLookAndFeel() {
    try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        
        
    }catch (Exception exc) {
        //ignore error
    }
}
public static void main(String[] arguments){
    new PrimeFinder();
}

   
   
}