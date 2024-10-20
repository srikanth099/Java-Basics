package org.krishna.basicjava.superpack;

class A
{
	int i=55;
}
class B extends A
{
	int i=112;
	int j=100;
	public void display()
	{
		System.out.println(this.i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
public class SuperDevelop {

	public static void main(String[] args) {
	B b=new B()	;
	b.display();

	}

}
