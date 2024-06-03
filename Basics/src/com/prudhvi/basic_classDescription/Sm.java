package com.prudhvi.basic_classDescription;

import java.util.Scanner;

public class Sm {
	 static int sum;
		static int temp;
		static int t;
		static int p;
		
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("enter the two values :");
			
			
			int n=scn.nextInt();
			int n1=scn.nextInt();
		    System.out.println(summing( n, n1));
			System.out.println("do you want contineous sir/madam then enter yes:\n"
					+ "do you want total sum! then enter no: ");
			String c1=scn.next();	
			while(c1.equals("yes")) {
				
				 System.out.println("enter the new value");
        		 int n2=scn.nextInt(); 
             	contsum(n1, n2);
             	 System.out.println("do want to contineous ! then enter yes:\n"+"do you want to sum output then enter no :");
             	 String c2=scn.next();
			  if(c2.equals("no")) {
                   newvalues(p,n2); break;
                   
			  }
			  
			
		}
			  
	}
			
            		 
		
		public static int summing(int n,int n1) {
			sum=n+n1;
			temp=sum;
			return sum;
			
		}
		public static int contsum(int y,int n2) {
			y+=n2;
			y=t;
			return y;
			
		}
		public static int newvalues(int x,int newval) {
			x+=newval;
			p=t;
			return x;
			
			
			
			
			
		}

	}


