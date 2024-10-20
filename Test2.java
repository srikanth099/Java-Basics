package com.testalgorithms.insta.exp1;

interface A{
	default void display() {
		System.out.println("A");
	}
}
class Demo implements A{
	public  void display() {
		System.out.println("Demo");
	}
}

public class Test2 {
	public static void main(String[] args) {
		A ref=new Demo();
		ref.display();`
	}
}
