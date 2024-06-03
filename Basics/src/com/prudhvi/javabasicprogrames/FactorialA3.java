package com.prudhvi.javabasicprogrames;

import java.util.Scanner;

public class FactorialA3 {
		static	int fact=1;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the given input ofthe factorial");
		int i=0,num=scn.nextInt();
	
		while(++i<=num) {
			fact=fact*i;
		}
		System.out.println("the factorial of  the given number "+fact);
	}

	}

