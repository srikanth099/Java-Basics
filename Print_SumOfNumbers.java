package org.krishna.basicjava.numbers;

import java.util.Scanner;

public class Print_SumOfNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter last number");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
