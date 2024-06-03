package com.prudhvi.factorial;

import java.util.Scanner;

public class ForloopFactorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the given input ofthe factorial");
		int num=scn.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("the factorial of  the given number "+fact);
	}

}
