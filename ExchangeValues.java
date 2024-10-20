package org.krishna.basicjava.superpack;
class A1
{
	int i;
	int j;
	public A1() {}
	
	public A1(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public void displayA1()
	{
	System.out.println(i+" "+j);	
	}
	}
class B1 extends A1
{
	int i;
	int j;
	public B1 (int i,int j)
	{
		super.i=i;
		super.j=j;
		this.i=i;
		this.j=j;
	}
	public void displayB1()
	{
		System.out.println(i+" "+j);	
		}
	
}

public class ExchangeValues {

	public static void main(String[] args) {
		B1 b=new B1(10,20);
		b.displayA1();
		b.displayB1();

	}

}
