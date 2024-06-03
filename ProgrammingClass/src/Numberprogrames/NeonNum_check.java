package Numberprogrames;

import java.util.Scanner;

public class NeonNum_check {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number Sir/Madam :('-')");
	int num=scn.nextInt();
	int sum=0, temp=num*num;
	while(temp>0) {
		int digit=temp%10;
		sum+=digit;
		temp/=10;
	}
	if(num==sum)System.out.println("This number is a Neon number :"+num);
	else System.out.println("This number is not a Neon number :"+num);
}
}
