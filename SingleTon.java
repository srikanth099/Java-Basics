package org.krishna.basicjava.singleton;

class B
{
	private static B t;
	static int count;
	private B()
	{
		count++;
	}
	public static B getInstance()
	{
		if(t==null)t=new B();
		return t;
	}
}
public class SingleTon {

	public static void main(String[] args) {
		B b1=B.getInstance();
		B b2=B.getInstance();
		B b3=B.getInstance();
		System.out.println(b1==b2);
		System.out.println(b2==b3);
System.out.println(b1==b3);
System.out.println("objects="+B.count);
}

}
