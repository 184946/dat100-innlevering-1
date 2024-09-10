package no.hvl.dat100;
import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int a = Integer.valueOf(scanner.nextLine());
        
        if (a>0) {
        
        } else {
        	System.out.println("Ugyldig tall, tast inn et tall som er større enn 0");
        	return;
        }
        
        int sum = 1;
        
        for (int i = 1; i<=a; i++){
            sum *= i;
        }
        System.out.println("Factorial: " + sum);

    }
}