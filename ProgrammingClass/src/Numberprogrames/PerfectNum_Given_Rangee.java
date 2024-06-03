 package Numberprogrames;

import java.util.Scanner;

public class PerfectNum_Given_Rangee {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("To check the perfect number or not ?\nEnter the number Sir/Madam :('-')");
		int num=scn.nextInt();
		for(int x=1;x<=num;x++) {
			int sum=0;
		for(int i=1;i<=x/2;i++) {
			
			if(x%i==0) {
			sum+=i;	
			}
		}
		if(x==sum)System.out.println(x);
		}
		
	}
}
