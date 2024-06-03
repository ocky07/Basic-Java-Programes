package com.prudhvi.bookingtickets;

import java.util.Scanner;

class Theatre{
	 int seats=100;
	 private static Theatre t=null;

	 public static Theatre getinstance() {
		 if(t==null) t=new Theatre();
		 return t;
	 }
	
	public void reserveseats(int numseats) {
		if(seats> numseats) {
			
			System.out.println(seats+"	:seats are available in a theatre");
			//System.out.println(numseats+"	:seats are not available in a theatre");
			
		}
		seats-=numseats;
		System.out.println(numseats+"	:seats are reserved/booked");
		System.out.println(seats+"		:seats are available");
	}
	
}
class bookingapp extends Theatre
{
	public void booktickets() {
		Scanner scn=new Scanner(System.in);
		System.out.println("how many tickets want !('-')");
		if(seats==0) System.out.println("****Sorry sir/madam House full  :please book tickets in next show ****/n"+"Have a good day");
		
		int numseats=scn.nextInt();
		// theatre=new Theatre();
		Theatre theatre=new.getinstance()
		theatre.reserveseats(numseats);
		
	}
}

public class BookmyShow {

	public static void main(String[] args) {

		bookingapp cus1=new bookingapp();
		cus1.booktickets();
		bookingapp cus2=new bookingapp();
		cus1.booktickets();
		bookingapp cus3=new bookingapp();
		cus1.booktickets();
		
		
	}

}
