package fibonacci_series;

import java.util.Scanner;

public class Fibonacci_seriesRange {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the range of the given number");
		int range=scn.nextInt();
		int f=0;
		int s=1;
		int thr=0;
		for(int i=0;i<=range;i++) {
			System.out.print(f+",");
			thr=f+s;
			f=s;
			s=thr;
			
		}
	}

}
