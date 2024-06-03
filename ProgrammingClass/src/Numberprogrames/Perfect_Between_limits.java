package Numberprogrames;

import java.util.Scanner;

public class Perfect_Between_limits {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Between range Sir/Madam :('-')");
		System.out.println("Enter the first num1:");
		int num1=scn.nextInt();
		System.out.println("Enter the first num2:");
		int num2=scn.nextInt();
		
		for(int x=num1;x<=num2;x++) {
			int sum=0;
		for(int i=1;i<=x/2;i++) {
			
			if(x%i==0) {
			sum+=i;	
			}
		}
		if(x==sum)System.out.println(x);
		}
		
	}
}
