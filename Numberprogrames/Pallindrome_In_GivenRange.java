package Numberprogrames;

import java.util.Scanner;

public class Pallindrome_In_GivenRange {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enetr the given input value Sir/Madam :('-')");
	int num=scn.nextInt();
	
	for(int i=1;i<=num;i++) {
		int temp=i;int rev=0;
	while(temp>0) {
		int rem=temp%10;
		rev=(rev*10)+rem;
		temp/=10;
	}
	if(i==rev) System.out.println(i);
	}
	
}
}