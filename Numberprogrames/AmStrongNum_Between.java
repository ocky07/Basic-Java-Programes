package Numberprogrames;

import java.util.Scanner;

public class AmStrongNum_Between {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Between Ranges:");
	System.out.println("Please enter num1");
	int num1=scn.nextInt();
	System.out.println("Please enter num2");
	int num2=scn.nextInt();
	for(int i=num1;i<=num2;i++) {
		int temp=i,count=0,sum=0;
		while(temp>0) {temp/=10; count++;}
		temp=i;
		while(temp>0) {
			int bit=temp%10;
			sum+=Math.pow(bit,count);
			temp/=10;
		}
		if(i==sum)System.out.println(i);
	}
}
}
