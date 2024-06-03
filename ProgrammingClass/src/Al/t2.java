package Al;

import java.util.Scanner;

public class t2 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("eneter the number Here: ");
	int num=scn.nextInt();
	int count=0;
	for(int i=0;i<=num;i++) {
		
		if(num%i==0) {
			count++;
		}
		
	if(count==2)System.out.println(i);
	}
	}
}
