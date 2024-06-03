package Statementsprog;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter the number sir/madam");
		int num=scn.nextInt();
		if(num%2==0) System.out.println("even number");
		else System.out.println("odd number");
}
}
