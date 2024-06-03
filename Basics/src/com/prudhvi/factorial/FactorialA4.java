package com.prudhvi.factorial;

import java.util.Scanner;

public class FactorialA4 {
		static int fact=1;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the factorial number");
		int i=0,num=scn.nextInt();
		int fact=1;
		do {
			fact=fact*i;
			++i;
		}
		while(i<=num); {
			System.out.println("the factorial of the given number is :"+fact);
			
		}

	}

}
