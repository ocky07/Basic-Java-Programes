package Numberprogrames;

import java.util.Scanner;

public class PerfectNum_Check {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("To check the perfect number or not ?\nEnter the number Sir/Madam :('-')");
	int sum=0, num=scn.nextInt();
	
	for(int i=1;i<=num/2;i++) {
		if(num%i==0) {
		sum+=i;	
		}
	}
	if(num==sum)System.out.println("This is Perfect number: "+num);
	else System.out.println("This is not a Perfect number: "+num);
}
}
