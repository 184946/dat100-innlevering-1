package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       

        for (int i = 1; i <= 10; i++) {
        	
        
        	
        	System.out.println("Hvor mye poeng fekk du?");
            int a = Integer.valueOf(scanner.nextLine());
        	
            if (a >= 0 && a <= 39) {
                System.out.println("Karakter F");
            } 
            else if (a >= 40 && a <= 49) {
                System.out.println("Karakter E");
            }
            else if (a >= 50 && a <= 59) {
                System.out.println("Karakter D");
            }
            else if (a >= 60 && a <= 79) {
                System.out.println("Karakter C");
            }
            else if (a >= 80 && a <= 89) {
                System.out.println("Karakter B");
            }
            else if (a >= 90 && a <= 100) {
                System.out.println("Karakter A");
            }
            else {
                System.out.println("Ugyldig poeng, tast inn gyldig poengsum mellom 0 og 100");
                i--;
            }

        }

    }
}
