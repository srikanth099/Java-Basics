package org.krishna.basicjava.numbers;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("not even");
		}
	}
}
