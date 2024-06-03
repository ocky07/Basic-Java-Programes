package Statementsprog;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter the number sir/madam");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		if(num1<num2) { System.out.println("num2 is big");
		if(num1>num2) { System.out.println("num1 is big");
		}}
		else System.out.println("both are equal");
	}
}
