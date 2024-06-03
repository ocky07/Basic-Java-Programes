package decimal_to_binaryConvert;

import java.util.Scanner;

public class BinTodec {

	public static void main(String[] args) {
		System.out.println("enter the binary digits code");
		Scanner scn=new Scanner(System.in);
		int bin=scn.nextInt();
		int i=1;
		int dec=0;
		while(bin>0) {
			int bit=bin%10;
			dec+=(bit*i);
			bin/=10;
			i*=2;			
		}
		System.out.println("the decimal number :"+dec);
	}

}
