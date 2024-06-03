package com.prudhvi.factorial;

import java.util.Scanner;

public class DoWhileloopFactorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the factorial number");
		int num=scn.nextInt();
		int fact=1;
		int i=1;
		do {
			fact=fact*i;
			i++;
		}
		while(i<=num); {
			System.out.println("the factorial of the given number is :"+fact);
			
		}

	}

}
