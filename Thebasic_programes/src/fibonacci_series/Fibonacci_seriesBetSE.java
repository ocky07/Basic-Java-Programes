package fibonacci_series;

import java.util.Scanner;

public class Fibonacci_seriesBetSE {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int f=scn.nextInt();
		int e=scn.nextInt();
		int a=0,b=1,c=0;
		while((c=a+b)<f) {
			a=b;
			b=c;
		}
		while((c=a+b)<=e) {
			System.out.print(f+",");
			a=b;
			b=c;
		}
			
		
	}

}
