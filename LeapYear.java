package org.krishna.basicjava.basics;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year");
		int year=scan.nextInt();
		if((year%400==0)||(year%100!=0 && year%4==0)){
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a LeapYear");
		}
	}
}
