package org.krishna.basicjava.superpack;

class Pattern
{
	public void design()
	{
		System.out.println("*************");
	}
}
class CustomizedPattern extends Pattern
{
	@Override
	public void design()
	{
		super.design();
		System.out.println("Thank You");
		System.out.println("$$$$$$$$$$$$$$$");
		
	}
}

public class SuperDevelop1 {

	public static void main(String[] args) {
		CustomizedPattern p=new CustomizedPattern();
		p.design();
	}

}
