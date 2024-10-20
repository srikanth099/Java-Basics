package org.krishna.basicjava.basics;

import java.util.Scanner;

public class ATMpinchecking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter PIN number");
		int pin=scan.nextInt();
		int opin=1234;
		if(pin==opin) {
			System.out.println("Entered pin is correct");
		}
		else System.out.println("Entered pin is incorrect");
		System.out.println("ThankYou :)");
	}

}
