package Fibinoci;

import java.util.Scanner;

public class Recursion {
public static void main(String[] args) {
	long a=0;
	long b=1;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the range");
	long range=scn.nextInt();
	long result=fib(1,a,b,range);
}
public static long fib(long n,long a,long b,long r){
	if(n==r) return a;
	long c=a+b;
	System.out.println(a);
	return fib(n+1,b,c,r);
}
}
