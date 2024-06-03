package Reversecount;

import java.util.Scanner;

public class Reversecount {

	public static int[] reverse(int[] num) {
		int[] a=new int[3];
		 a=num;
		 for(int i=0;i<=a.length-1;i++) {
		 for(int j=a.length;i>0;i--) {
			a[j]=a[i];
		 }
		 
		 }
		 return a;
		
		
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int[] num=nescn.nextInt();
		if(num>0) {
			reverse(num);
		}

	}

	

}
