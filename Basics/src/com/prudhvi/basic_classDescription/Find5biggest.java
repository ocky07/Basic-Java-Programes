package com.prudhvi.basic_classDescription;

import java.util.Scanner;

public class Find5biggest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the eles");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int n4=sc.nextInt();
	int n5=sc.nextInt();
	int[] a= {n1,n2,n3,n4,n5};
	if(n1>n2&&n1>n3&&n1>n4&&n1>n5) {
		System.out.println(n1+"the 5th biggest number");
	}
	 if(n2>n1&&n2>n3&&n2>n4&&n2>n5) {
		System.out.println(n2+"the 5th biggest number");
	}
	 if(n3>n1&&n3>n2&&n3>n4&&n3>n5) {
		System.out.println(n3+"the 5th biggest number");
	}
	 if(n4>n1&&n4>n2&&n4>n3&&n2>n5) {
		System.out.println(n4+"the 5th biggest number");
	}
	 if(n5>n1&&n5>n2&&n5>n3&&n5>n4) {
		System.out.println(n5+"the 5th biggest number");
	}
	 
	 System.out.println(bigele(a, 5));
	 
	 
}
public static int bigele(int[] a,int num) {
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length-1;j++) {
		if(a[i]>a[j])  {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	return a[num];
	
}
}

