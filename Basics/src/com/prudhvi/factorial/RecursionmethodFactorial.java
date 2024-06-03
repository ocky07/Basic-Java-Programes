package com.prudhvi.factorial;

import java.util.Scanner;

public class RecursionmethodFactorial {
	static int fact;
	public static int factorial(int n) {
		if(n==0)return 1;
		else return (n*factorial(n-1));
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the given input ofthe factorial");
		int num=scn.nextInt();
	
		fact=factorial(num);
		System.out.println("the factorialof the given number"+num+"is:"+fact);
		

	}

}
