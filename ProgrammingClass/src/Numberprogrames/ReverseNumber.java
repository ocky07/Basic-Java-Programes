package Numberprogrames;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enetr");
	int range=scn.nextInt();
	
	for(int i=1;i<=range;i++) {
		int temp=i, reverse=0;
		while(temp>0) {
			int rem=temp%10;
			reverse=(reverse*10)+rem;
			temp/=10;
			
		}
		System.out.println(reverse);
	}
}
}
