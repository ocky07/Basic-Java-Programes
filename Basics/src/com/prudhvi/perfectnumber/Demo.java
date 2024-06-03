package com.prudhvi.perfectnumber;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int sum=0;
		for(int i=1;i<num/2;i++) {
			if(num%i==0) sum+=i;
		}
		if(num==sum) System.out.println("The given number is the perfect number");
		else System.out.println("The given number is the not a perfect number");

	}

}
