package WroghWork;

import java.util.Scanner;

public class Tesst2 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the pallindrome number here :");
	int rev=0, num=scn.nextInt();
	int temp=num;
	while(temp>0) {
		int digit=temp%10;
		rev=(rev*10)+digit;
		temp/=10;
	}
	if(num==rev)System.out.println("pallindrome number");
	else System.out.println("Not a pallindrome number");
}
}
