package org.krishna.basicjava.numbers;

import java.util.Scanner;

public class GCD_HCF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = a < b ? a : b;
		while (true) {
			if (a % n == 0 && b % n == 0) break;
			n--;
		}
		System.out.println("gcf of " + a + " and " + b + " = " + n);
	}
}
