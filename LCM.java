package org.krishna.basicjava.numbers;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = a > b ? a : b;
//		while (true) {
			if (n % a == 0 && n % b == 0)
//			n++;
		
		System.out.println("lcm of " + a + " and " + b + " = " + n);
	}
}
