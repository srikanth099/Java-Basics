package org.krishna.basicjava.basics;

import java.util.Scanner;

public class StudentResults {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter name of the student");
		String name=scan.next();
		System.out.println("enter 6-subjects marks of the student");
			int s1=scan.nextInt();
			int s2=scan.nextInt();
			int s3=scan.nextInt();
			int s4=scan.nextInt();
			int s5=scan.nextInt();
			int s6=scan.nextInt();
			int sum=s1+s2+s3+s4+s5+s6;
			float aggregate=sum/6f;
			if(s1<35||s2<35||s3<35||s4<35||s5<35||s6<35) {
				System.out.println(name+" is failed");
				System.out.println("total marks is "+sum);
			}
			else {
				System.out.println(name+" is passed");
				System.out.println("total marks is"+sum);
			}
			if(aggregate>=90) {
				System.out.println("A grade");
			}
			else if(aggregate>=80 && aggregate<=90) {
				System.out.println("B grade");
			}
			else if(aggregate>=70 && aggregate<=80) {
				System.out.println("C grade");
			}
			else if(aggregate>=60 && aggregate<=70) {
				System.out.println("D grade");
			}
			else {
				System.out.println("Below Average");
			}
	}
}
