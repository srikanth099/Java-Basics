package org.krishna.basicjava.superpack;

class A4
{
	int i;
	int j;
	public A4 (int i,int j)
	{
	this.i=i;
	this.j=j;
	}
	public void displayA4()
	{
		System.out.println(i+" "+j);
	}
}
class B4 extends A4
{
	int i;
	int j;
	public B4(int i, int j)
	{
		super(i,j);
				this.i=i;
		this.j=j;
	}
	public void displayB4()
	{
		System.out.println(i+" "+j);
	}
}
public class Test {

	public static void main(String[] args) {
		
B4 b=new B4(12,45);
b.displayA4();
b.displayB4();
	}

}
