package fibonacci_series;

import java.util.Scanner;

public class checkedFsOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the positive number");
		int inputnumber=scn.nextInt();
		int firstterm=0;
		int secondterm=1;
		int thirdterm=0;
		while(thirdterm<inputnumber) {
			thirdterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=thirdterm;
		}
		if(thirdterm==inputnumber)System.out.println("the given number belongs to fabonacci series");
		else System.out.println("the given number is not belongs  to fibinacci series");

	}

}
