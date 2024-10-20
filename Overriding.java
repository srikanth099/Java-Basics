package org.krishna.basicjava.methodoverriding;

class parent
{
	public void call()
	{
		System.out.println("9485395576");
	}
}
class child extends parent
{
	@Override
	public void call()
	{
	System.out.println("9474865739");	
	}
}
public class Overriding {

	public static void main(String[] args) {
		
 child c=new child();
c.call();

	}

}
