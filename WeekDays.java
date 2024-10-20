package org.krishna.basicjava.basics;

import java.util.Scanner;

public class WeekDays {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter day");
		int day=scan.nextInt();
		switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Thusday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Tuesday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid Day");
		}
	}
}
