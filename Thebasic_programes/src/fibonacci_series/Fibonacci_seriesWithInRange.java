package fibonacci_series;

import java.util.Scanner;

public class Fibonacci_seriesWithInRange {

	public static void main(String[] args) {
		System.out.println("enetr the number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int firstTerm = 1, secondTerm = 1 ,nextTerm;
	    
	    while (firstTerm <= n) {
	      System.out.print(firstTerm + ", ");

	       nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	      

	    }
	}

}
