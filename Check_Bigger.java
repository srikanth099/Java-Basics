package org.krishna.basicjava.numbers;

public class Check_Bigger {
	public static void main(String[] args) {
		System.out.println(isTernery(50,10));
		System.out.println(noTernery(20, 26));
	}

	public static int isTernery(int a, int b) {
		int c = a > b ? a : b;
		return c;
	}

	public static int noTernery(int a, int b) {
		if (a > b)
			return a;
		return b;
	}
}
