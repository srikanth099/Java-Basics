package org.krishna.basicjava.methodoverriding;

import java.util.Scanner;
class Factorial
{
	public int factor(int num)
	{
		int fact=1;
		for (int i=1;i<=num;i++) fact=fact*i;
		return fact;
	}
}
class strongNumber extends Factorial
{
	@Override
	public int factor(int num)
	{
		if(num==0||num==1) return 1;
		else return num*factor(num-1);
	}
	public int strong(int num)
	{
		int res=0;
		while (num!=0)
		{
			int rem = num%10;
			res=res+factor(rem);
			num=num/10;
				
		}
		return res;
	}
}
public class Strong {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("num:");
		int number=scn.nextInt();
		strongNumber s=new strongNumber();
		int result =s.strong(number);
		if(result==number)System.out.println("strong");
		else System.out.println("no");

	}

}
