package Numberprogrames;

import java.util.Scanner;

public class PrimeNum_between_Range {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the num1 Sir/Madam: ('-')");
	int num1=scn.nextInt();
	System.out.println("Enter the num2 Sir/Madam: ('-')");
	int  num2=scn.nextInt();
	for(int i=num1;i<=num2;i++) {
		int count=0;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				count++;
				break;
			}
		}
		if(count==0)System.out.println(i);
	}
}
}
