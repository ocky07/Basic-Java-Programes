package com.prudhvi.pallindrome;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the input number");
		int rev=0, n=scn.nextInt();
		int temp=n;
		while(n>0) {
			int bit=n%10;
			 rev=(rev*10)+bit;
			 n/=10;
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("The given number is the pallindrome");
		}
		else System.out.println("the given number is the not a pallindrome");
	}
}
