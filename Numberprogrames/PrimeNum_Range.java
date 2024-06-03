package Numberprogrames;

import java.util.Scanner;

public class PrimeNum_Range {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Range Sir/Madam:('-')");
	int count,range=scn.nextInt();
	for(int i=1;i<=range;i++) {
		count=0;
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
