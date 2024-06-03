package prime;

import java.util.Scanner;

public class Prime3 {
	 public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("enetr the two inputs: ");
		  int count,num1=scn.nextInt();
		  int num2=scn.nextInt();
		  System.out.println("between the prime numbers: ");

		  for (int i =0; i <= num2; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
		 }
}
