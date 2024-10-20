package org.krishna.basicjava.singleton;

import java.util.Scanner;
class Theatre
{
	int seats=50;
	private static Theatre t=null;
	private Theatre()
	{
		
	}
	public static Theatre getInstance()
	{
		if(t==null) t=new Theatre();
		return t;
		
	}
	public void reserveSeats(int numSeats)
	{
		if(numSeats>seats)
		{
			System.out.println(numSeats+"Seats are not available");
			System.out.println(seats+"seats are available");
			return;
		}
		seats=seats-numSeats;
		System.out.println(numSeats+"seats are reserved");
		System.out.println(seats+"seats are available");
	}
}
 class BookingApp {

	public void bookTickets()
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("How many tickets :");
		int tickets=scan.nextInt();
		Theatre theatre=Theatre.getInstance();
		theatre.reserveSeats(tickets);
		}
	}
 class BookMyShow {
public static void main(String[] args)
{
	BookingApp cust1=new BookingApp();
	cust1.bookTickets();
	BookingApp cust2 = new BookingApp();
	cust2.bookTickets();
	BookingApp cust3 = new BookingApp();
	cust3.bookTickets();
}
	}
