package Numberprogrames;

import java.util.Scanner;

public class HappyNumber_Given_Range {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number:\nSir/Madam :('-')");
	   int num=scn.nextInt();
	   int temp=num;
	   for(int i=2;i<=num;i++) {
	   while(i!=1 && i!=4) {
		   i=checkHappyNumber(i);
		   if(i==1) System.out.println(i);
	   		}
	   }
	}
	public static int checkHappyNumber(int n) {
		int rem=0,sum=0;
		while(n>0) {
			rem=n%10;
			sum+=(rem*rem);
			n/=10;
		}
		return sum;
	}
}
