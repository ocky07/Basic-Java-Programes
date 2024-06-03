package Pallindrome;

import java.util.Scanner;

public class Checked_P_Or_Not {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enetr the given input value :");
	int num=scn.nextInt();
	int temp=num;
	int rev=0;
	while(temp>0) {
		int bit=temp%10;
		rev=(rev*10)+bit;
		temp/=10;
	}
	if(num==rev) System.out.println("The given number is the pallindrome"); 
	else System.out.println("The given number is the not a pallindrome");	
}
}
