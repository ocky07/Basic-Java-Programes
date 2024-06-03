package com.prudhvi.practice;

public class Test2 {

	public static void main(String[] args) {
		 int a=123456789;
         int rev=0;
         int i=1;
         for(;a!=0;) {
        	 int dit=a%10;
        	 rev+=dit*i;
        	 i*=10;
        	 
         }
         System.out.println(rev);
    		
    	}
	}
