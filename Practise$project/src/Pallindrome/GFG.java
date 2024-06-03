package Pallindrome;

import java.util.Scanner;

public class GFG {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enetr the number");
	int num=scn.nextInt();
	int num1=scn.nextInt();
	for(int i=num;i<=num1;i++) {
		if(ispallindrome(i) == 1) {
			System.out.println(i+" ");
		}
	}
}
public static int ispallindrome(int i) {
	int rev=0;
	while(i>0) {
		int dit=i%10;
	 rev=(rev*10)+dit;
	 	i/=10;
	 	return(rev==i)? 1 : 0;
	}
	
		return-1;
	
}
}
