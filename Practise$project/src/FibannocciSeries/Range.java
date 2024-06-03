package FibannocciSeries;

import java.util.Scanner;

public class Range {
public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr the range of the series:");
		int num=scn.nextInt();
		int a=0,b=1,c=0,i;
		
		for(i=0;i<=num;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
