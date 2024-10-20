package org.krishna.basicjava.numbers;

import java.util.Scanner;

public class Print_start_end {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int start=scan.nextInt();
		int end=scan.nextInt();
		isAcending(start,end);
		isDesending(start,end);
	}
	public static void isAcending(int start,int end) {
		for(int i=start;i<=end;i++) {
			System.out.println(i);
		}
	}
	public static void isDesending(int start,int end) {
		for(int i=end;i>=start;i--) {
			System.out.println(i);
		}
	}
}
