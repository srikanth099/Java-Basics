package org.krishna.basicjava.numbers;

class demo1 {
	String name;
	String color;
	int cnum;

	demo1(String name, String color, int cnum) {
		this.name = name;
		this.color = color;
		this.cnum = cnum;
	}

	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cnum);
	}
}

public class demo {
	public static void main(String[] args) {
		int cnum = 1001;
		demo1 d = new demo1("BMW", "black", cnum++);
		d.display();

		demo1 d1 = new demo1("Benzz", "white", cnum++);
		d1.display();
	}
}