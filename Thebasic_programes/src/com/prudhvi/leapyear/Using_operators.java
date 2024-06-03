package com.prudhvi.leapyear;

import java.util.Scanner;

public class Using_operators {

	public static void main(String[] args) {
		
			Scanner scn=new Scanner(System.in);
			System.out.println("enter the year");
			int year=scn.nextInt();
			if((year%4==0||year%400==0) && (year%100!=0)) {
				System.out.println("leap year");
			}else System.out.println("not leap year");

	}

}
