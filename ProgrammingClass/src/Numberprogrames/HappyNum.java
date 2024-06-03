package Numberprogrames;

import java.util.Scanner;

public class HappyNum {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number:\nSir/Madam :('-')");
   int num=scn.nextInt();
   int temp=num;
   while(temp!=1 && temp!=4) {
	   temp=checkHappyNumber(temp);
   }
   if(temp==1) System.out.println("Happy number:"+num);
   else System.out.println("Not a Happy number:"+num);
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
