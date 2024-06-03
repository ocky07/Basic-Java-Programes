package Numberprogrames;

import java.util.Scanner;

public class NeonNum_GivenRange {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Range of the Neon number :('-')");
	int range=scn.nextInt();
	
	for(int i=0;i<=range;i++) {
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