package com.prudhvi.retn2;

import java.util.Scanner;

public class Return2 {
	static int result;
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		 System.out.println("select the option below");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
		public static int addition() {
			try (Scanner s1 = new Scanner(System.in)) {
				System.out.println("enter the two values="+                                              
			     "a and b");
				int a=s1.nextInt();
				int b=s1.nextInt();
				result=a+b;
				System.out.println(a+"+"+b+"="+result);
			}
			return result;	
		}
		public static int Substraction() {
			try (Scanner s2= new Scanner(System.in)) {
				System.out.println("enter the two values="+                                              
			     "a and b");
				int a=s2.nextInt();
				int b=s2.nextInt();
				if(a>b){
				result=a-b;
				System.out.println(a+"-"+b+"="+result);
				return result;
				}
				result=a-b;
				System.out.println(a+"-"+b+"="+result);
			}
			return result;	
			
		}

}
