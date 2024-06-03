package com.prudhvi.retn;

import java.util.Scanner;

public class Return {
	static int result;
	public static void main(String[] args) throws Exception{
	

	Scanner scn=new Scanner(System.in);
	System.out.println("1.ADD\n2.sub\n3.mul");
	int key=scn.nextInt();
	switch (key) {
	case 1: addition();
	      System.out.println("do you want contine!! Say yes or No");
	     try {
	    	 Scanner sc=new  Scanner(System.in);
	    	 System.out.println("hello");
	    	 String s=sc.next();
		      if(s.equals("yes")) {
		    	  System.out.println("Enter again:\n1.ADD\n2.sub\n3.mul");
		      
		      int mov=scn.nextInt();
		      
		      key=mov;
		      }else System.out.println("THANK YOU SIR/MADAM ('-')");
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
	      break;
	 case 2:Substraction();
	 	System.out.println("do you want contine!! Say yes or No");
	 	String s1=scn.next();
	 	if(s1.equals("yes")) {
	 		System.out.println("Enter again:\n1.ADD\n2.sub\n3.mul");
	 		int mov=scn.nextInt();
     
	 		key=mov;
	 		}else System.out.println("THANK YOU SIR/MADAM ('-')");
	 		break;
	 case 3:multiple();
	 System.out.println("do you want contine!! Say yes or No");
	 	String s2=scn.next();
	 	if(s2.equals("yes")) {
	 		System.out.println("Enter again:\n1.ADD\n2.sub\n3.mul");
	 		int mov=scn.nextInt();
  
	 		key=mov;
	 		}else System.out.println("THANK YOU SIR/MADAM ('-')");
	 		break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + key);
	}
	
	
		
	}
	public static void addition() {
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("enter the two values="+                                              
		     "a and b");
			int a=s1.nextInt();
			int b=s1.nextInt();
			result=a+b;
			System.out.println(a+"+"+b+"="+result);
		}
		
	}
	public static void Substraction() {
		try (Scanner s2= new Scanner(System.in)) {
			System.out.println("enter the two values="+                                              
		     "a and b");
			int a=s2.nextInt();
			int b=s2.nextInt();
			if(a>b){
			result=a-b;
			System.out.println(a+"-"+b+"="+result);
		
			}
			result=b-a;
			System.out.println(a+"-"+b+"="+result);
		}

		
	}
	public static void multiple() {
		try (Scanner s3= new Scanner(System.in)) {
			System.out.println("enter the two values="+                                              
		     "a and b");
			int a=s3.nextInt();
			int b=s3.nextInt();
			result=a*b;
			System.out.println(a+"*"+b+"="+result);
		}
			
		
		
	}
	
}
