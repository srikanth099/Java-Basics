package org.krishna.basicjava.methodhiding;

class A
{
	public static void m1()
	{
		System.out.println("red");
	}
}
class B extends A
{
	public static void m1()
	{
		System.out.println("pink");
	}
}
public class MethodHidingTest {

	public static void main(String[] args) {
	A a=new A();
	a.m1();
	B b=new B();
	b.m1();
	A a1=new B();
	a1.m1();
			}

}
