package Numberprogrames;

import java.util.Scanner;

public class NeonNum_Between_Range {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Between ranges:\nEnter the first number Sir/Madam :('-')");
	int first=scn.nextInt();
	System.out.println("Enter the last number Sir/Madam :('-') ");
	int last=scn.nextInt();
	for(int i=first;i<=last;i++) {
		int sum=0, temp=i*i;
		
		while(temp>0) {
			int digit=temp%10;
			sum+=digit;
			temp/=10;
		}
		if(i==sum)System.out.println(i);
	}
}
}
