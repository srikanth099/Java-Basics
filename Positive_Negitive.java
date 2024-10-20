package org.krishna.basicjava.numbers;

import java.util.Scanner;

public class Positive_Negitive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		if (num >= 0) {
			System.out.println("positive");
		} else if (num < 0) {
			System.out.println("negitive");
		}
	}
}
