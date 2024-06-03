package Numberprogrames;

import java.util.Scanner;

public class HCF_OfTwoNum {
public static void main(String[] args) {
	
	int hfc=0;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the first value Sir/Madam:");
	int num1=scn.nextInt();
	System.out.println("Enter the second value Sir/Madam:");
	int num2=scn.nextInt();
	int hcf=0;
	for(int i=1;i<=num1 || i<=num2;i++) 
	{
		if(num1%i==0 && num2%i==0)
		{
			hcf=i;
		}
	}
	System.out.println(hcf);
}
}
