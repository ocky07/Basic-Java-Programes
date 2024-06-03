package com.prudhvi.javabasicprogrames;

import java.util.Scanner;

public class PrimeA1 {

	public static void main(String[] args) {
		int count=0;
	
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the digit :");
		int num=scn.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				++count;
			}
		}
		if(count==2) {
			System.out.println("the given number is the prime");
		}else {
			System.out.println("the given number is not a prime number");
		}
	}

}
