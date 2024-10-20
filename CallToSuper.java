package org.krishna.basicjava.superpack;

class A2 {
	public A2() {
		System.out.println("No arg Constructor of class A");
	}
}

class B2 extends A2 {
	public B2() {
		System.out.println("No arg Constructor of class B");
	}

	public B2(int i) {
		System.out.println("1 arg Constructor of class B");
	}
}

public class CallToSuper {

	public static void main(String[] args)
	{
		
            B2 b=new B2();
            B2 b1=new B2(10);
	}
}
