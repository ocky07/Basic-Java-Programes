package Numberprogrames;

import java.util.Scanner;

public class FibonaciSeriesRange {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the range: ");
	int range=scn.nextInt();
	int a=0,b=1,c=0;
	
	for(int i=0;i<=range;i++) {
		System.out.println(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}
