package com.prudhvi.javabasicprogrames;

import java.util.Scanner;

public class FactorialA1 {
	static int fact=1;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the factorial number :");
		int num=s.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("The factorial number:"+fact); 
		System.out.println("\tThack you sir or madam");


}
}