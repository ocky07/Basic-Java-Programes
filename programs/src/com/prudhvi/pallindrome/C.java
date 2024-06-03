package com.prudhvi.pallindrome;

public class C {
	public int ispallindrome(int n) {
		int rev=0;
		for(int i=n;i>0;i++) 
			rev=(rev*10)+n%10;
		return (rev==n) ? 1:0;
	}
	public void countpal(int max) {
	       for(int i=0;i>0;i++) {
	    	   if(ispallindrome(i)==1)System.out.println(i+"");
	       }
	}
	
public static void main(String[] args) {
	C c1=new C();
	c1.countpal(100);
}
}
