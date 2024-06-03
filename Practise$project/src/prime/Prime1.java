package prime;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=scn.nextInt();
		int i=1, count=0;
		while(i<=num)
		{
		if(num%i==0) {++count;}i++;
		}
		if(count==2)System.out.println("Yes");
		else System.out.println("No");
	}
}
