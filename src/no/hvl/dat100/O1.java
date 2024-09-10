package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bruttolønn:");
		int inntekt = Integer.valueOf(scanner.nextLine());
		
		
		if (inntekt>=0 && inntekt<=208050) {
			System.out.println("Du betaler ingen trinnskatt");
		} 
		else if (inntekt>=208051 && inntekt<=292850) {
			System.out.println("Med inntekten " +inntekt+ " betaler du 1.7% trinnskatt, altså: " + (inntekt-208051)*0.017 + "kr");
		}
		else if (inntekt>=292851 && inntekt<=670000) {
			System.out.println("Med inntekten " +inntekt+ " betaler du 4.0% trinnskatt, altså: " + (inntekt-292851)*0.040 + "kr");
		}
		else if (inntekt>=670001 && inntekt<=937900) {
			System.out.println("Med inntekten " +inntekt+ " betaler du 13.6% trinnskatt, altså: " + (inntekt-670001)*0.136 + "kr");
		}
		else if (inntekt>=937901 && inntekt<=1350000) {
			System.out.println("Med inntekten " +inntekt+ " betaler du 16.6% trinnskatt, altså: " + (inntekt-937901)*0.166 + "kr");
		}
		else if (inntekt>=1350001) {
			System.out.println("Med inntekten " +inntekt+ " betaler du 17.6% trinnskatt, altså: " + (inntekt-1350001)*0.176 + "kr");
		} else {
			System.out.println("Ugyldig tall, skriv inn et positivt tall");
			return;
		}
		
		
		
		

	}

}
