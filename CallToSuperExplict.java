package org.krishna.basicjava.superpack;

class A3 {
	public A3(int i) {
		System.out.println("1 arg Constructor of class A3");
	}
}

class B3 extends A3 {
	public B3(int i) {
		super(23);
		System.out.println("1 arg Constructor of class B3");
	}
}

public class CallToSuperExplict {

	public static void main(String[] args) {

	}
}
