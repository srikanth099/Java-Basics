package org.krishna.basicjava.basics;

public class Patterns {
	public static void main(String[] args) {
		Patterns p = new Patterns();
//		p.pattern1();
//		p.pattern2();
//		p.pattern3();
//		p.pattern4();
//		p.pattern5();
//		p.pattern6();
		p.pattern7();
		p.pattern8();
	}

	public int size() {
		return 5;
	}

	private static int count = 1;

	public static void codecount() {
		System.out.println("----------------");
		System.out.println("Pattern=" + count++);
		System.out.println("----------------");
	}

	public void pattern1() {
		Patterns.codecount();
		for (int i = 1; i <= size(); i++) {
			for (int j = i; j <= size(); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void pattern2() {
		Patterns.codecount();
		for (int i = 1; i <= size(); i++) {
			for (int j = i; j <= size(); j++) {
				System.out.print(j + " ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public void pattern3() {
		Patterns.codecount();
		for (int i = 1; i < size() + 1; i++) {
			for (int j = 1; j < size() + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void pattern4() {
		Patterns.codecount();
		for (int i = 1; i <= size(); i++) {
			for (int j = i; j <= size(); j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public void pattern5() {
		for (int i = 1; i <= size(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void pattern6() {
		for (int i = 1; i <= size(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void pattern7() {
		for (int i = 1; i <= size(); i++) {
			for (int j = 1; j <= size(); j++) {
				if (i == 1 || j == 1 || i == size() || j == size()) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void pattern8() {
		for(int i=1;i<=size();i++) {
			for(int j=1;j<=size();j++) {
				if(i==1 || i==size()) {
					System.out.print(j+" ");
				}
				else if(j==1 || j==size()){
					System.out.print(1+" ");
				}
			}
			System.out.println( );
		}
	}
}
