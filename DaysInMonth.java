package org.krishna.basicjava.basics;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year");
		System.out.println("enter month");
		int year=scan.nextInt();
		int month=scan.nextInt();
		//Contitional Statements
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				System.out.println("31 Days");
			}
			else if(month==4||month==6||month==9||month==11) {
				System.out.println("30 Days");
			}
			else if(month==2) {
				if((year%400==0)||(year%100!=0 && year%4==0)){
					System.out.println("29 Days");
				}
				else {
					System.out.println("28 Days");
				}
			}
			else {
				System.out.println("Invalid Month");
			}
		//Switch Condition
			switch(month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("31 Days");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("30 Days");
					break;
				case 2:
					if((year%400==0)||(year%100!=0 && year%4==0)){
						System.out.println("29 Days");
					}
					else {
						System.out.println("28 Days");
					}
					break;
					default:
						System.out.println("Invalid Month");
			}
			
	}
}
