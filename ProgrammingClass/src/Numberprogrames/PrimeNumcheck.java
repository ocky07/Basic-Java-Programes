package Numberprogrames;

import java.util.Scanner;

public class PrimeNumcheck {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number Sir/madam: ('-')");
	int count=0,num=scn.nextInt();
	for(int i=1;num>=i;i++ ) {
		if(num%i==0) {
			count++;
		}
	}
	
	/*while(num>=i) {
		if(num%i==0) {
			++count;
		}
		i++;
	}*/
	//System.out.println(count);
	if(count==2)System.out.println("This number is the prime number: "+num);
	else System.out.println("This number is not a prime number:  "+num);
}
}
