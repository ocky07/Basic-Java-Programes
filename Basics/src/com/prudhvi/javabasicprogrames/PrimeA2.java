package com.prudhvi.javabasicprogrames;

import java.util.Scanner;

public class PrimeA2 {

	    public static void main(String args[])
	    {
	         int s1, flag = 0, i, j;
	         Scanner s = new Scanner(System.in);
	  
	         System.out.println ("Enter the range  :"); 
	          s1= s.nextInt();
	         System.out.println ("The prime number range  limits are :");
	         for(i = 0; i <= s1; i++)
	         {
	             for( j = 2; j < i; j++)
	             {
	                 if(i % j == 0)
	                 {
	                     flag = 0;
	                     break;
	                 }
	                 else
	                 {
	                     flag = 1;
	                 }
	             }
	             if(flag == 1)
	             {
	                 System.out.println(i);
	         
	             }
	            
	         
	         }
	         
	         
	    }
	   
}