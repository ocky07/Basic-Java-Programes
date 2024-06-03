package com.prudhvi.Adding$Asking;

import java.util.Scanner;

public class test {
static int temp;
    
	public static void main(String[] args)
	{
		int n2 = 0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the two input values sir/madam");
		
		int n=scn.nextInt();
		int n1=scn.nextInt();
	
		System.out.println(summing(n,n1));
		System.out.println("do you want contineous sir/madam: "+"yes or no");
		String s=scn.next();
		
		switch (s) {
		case "yes": {
				
			while(s.equals("yes")){
				System.out.println("enter the input value");
				n2=scn.nextInt();																				
				contsum(temp, n2);
				System.out.println("do you want contineous sir/madam");
				String q=scn.next();
				if(q.equals("no")) 
					
				 break;
				}
			
			}
		
		case "no":{
			
			System.out.println(contsum(temp,n2));
			break;
		}
		default:
		            
		}}
	public static int summing(int n,int n1) {
		int sum=n+n1; 
       temp=sum;
		return temp;
	
	}
	public static int contsum(int sum,int n) {
		int temp=sum+n;
		return temp;
		
	}


}
