package FibannocciSeries;

import java.util.Scanner;

public class Between_Limits {
public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("start input num1:");
		int num1=scn.nextInt();
		System.out.println("end input num2 :");
		int num2=scn.nextInt();
		int a=0,b=1,c=0,i;
		
		for(i=num1;i<=num2;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
