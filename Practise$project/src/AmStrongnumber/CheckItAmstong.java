package AmStrongnumber;

import java.util.Scanner;

public class CheckItAmstong {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Plese enter the number : madam / sir");
	int num=scn.nextInt();
	int count=0;
	int sum=0;
	int temp=num;
	//temp=num;
	while(temp>0) {
		int bit=temp%10;
		sum+=Math.pow(bit,3);
		temp/=10;
	}
	if(num==sum)System.out.println("the given number is the amstrong number: "+sum);
	else System.out.println("the given number is the not amstrong number");
}
}
