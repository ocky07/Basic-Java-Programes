package Numberprogrames;

import java.util.Scanner;

public class Fibonaci_Series_BetweenRange {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the first value: ");
	int first=scn.nextInt();
	System.out.println("Enter the last value: ");
	int last=scn.nextInt();
	int a=0,b=1,c=0;
	for(int i=first;i<=last;i++) {
		System.out.println(first+" ");
		 c=a+b;
		a=b;
		b=c;
	}	
}
}
