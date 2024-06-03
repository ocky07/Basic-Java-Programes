package Numberprogrames;

import java.util.Scanner;

public class Factorial_Using_Recursion {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Factorial number Sir/Madam:('-')");
	int num=scn.nextInt();
	Factorial_Using_Recursion f=new Factorial_Using_Recursion(); 
	
	System.out.println(f.factorial(num));
}
public int factorial(int n) {
	int fact=1;
	if(n==0)return 1; 
	else return (n*factorial(n-1));
	
}
}
