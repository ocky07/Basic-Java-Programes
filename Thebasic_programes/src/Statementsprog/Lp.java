package Statementsprog;

import java.util.Scanner;

public class Lp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int year=scn.nextInt();
		if((year%400==0 ) || (year%4==0 && year%100!=0)) {
			System.out.println("leapyear");
		}
		else {
		 System.out.println("not a leap year");
		}

	}

}
