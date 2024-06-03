package com.prudhvi.javabasicprogrames;

import java.util.Scanner;

public class PrimeA3 {

	public static void main(String[] args) {
		int s1,s2,i,j,condition=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower value sir or madam :: please");
		s1=s.nextInt();
		System.out.println("Enter the upper value sir or madam :: please");
		s2=s.nextInt();
		System.out.println("The range between given two inputs prime number limits are :");
		for(i=s1;i<=s2;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					condition=0;
					break;
				}
				else {
					condition=1;
				}
			}
			if(condition==1) {
				System.out.println("    "+i);
			}
		}
	}

}
