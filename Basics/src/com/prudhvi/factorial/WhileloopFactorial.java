package com.prudhvi.factorial;

import java.util.Scanner;

public class WhileloopFactorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the given input ofthe factorial");
		int num=scn.nextInt();
		int fact=1;
		int i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
			System.out.println("the factorial of the given output is :"+fact);
	}

}
