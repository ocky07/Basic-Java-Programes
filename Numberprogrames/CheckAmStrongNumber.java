package Numberprogrames;

import java.util.Scanner;

public class CheckAmStrongNumber {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number Sir/Madam :('-')");
	int number=scn.nextInt();
	int temp=number;
	int sum=0, count=0;
	while(number>0) {
		count++;
		number/=10;
	}
	                                                            //System.out.println(count);
	number=temp;
	                                                            //System.out.println(number);
	while(number>0) {
		int bit=number%10;
		 int fact=1;
		 for(int i=1;i<=count;i++)
		 {
			 fact=fact*bit;
		 }
		 sum=sum+fact;
		  number/=10;													//	sum+=bit*count;	????
	    }											//System.out.println(sum)
		  
		  													     //System.out.println(number);															//System.out.println(temp);
	if(temp==sum)System.out.println("Amstrog number");
	else System.out.println("Not an Amstrong number");
	
}
}
