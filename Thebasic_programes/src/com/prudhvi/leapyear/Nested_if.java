package com.prudhvi.leapyear;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scn.nextInt();
		if(year%4==0) {
			if(year%400==0) {
				if(year%100==0){
					System.out.println(year+" Not a leap year");
				}else System.out.println(year+" leap year");
			}else System.out.println(year+"leap year");
		}else System.out.println(year+"leap year");
	}

}
