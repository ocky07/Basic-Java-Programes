package com.prudhvi.javabasicprogrames;
import java.util.Scanner;
public class FactorialA2UsingRecursion {
	static int fact;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the factorial number :");
		int num=s.nextInt();
		System.out.println("The factorial of "+num+" is ('-') :");
		
		System.out.println(factorial(num));
		

	}
	public static int factorial(int n) {
		if(n==0) {
			return 1; //recursion calling is ended here ("-")
		}
		else return (n*factorial(n-1));
	}

}
