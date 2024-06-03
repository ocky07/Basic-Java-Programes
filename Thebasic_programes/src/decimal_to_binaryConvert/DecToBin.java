package decimal_to_binaryConvert;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		System.out.println("enter the decimal number");
		Scanner scn=new Scanner(System.in);
		int dec=scn.nextInt();
		int bin=0;
		int i=1;
		while(dec>0) {
			int bit=dec%2;
			bin+=bit*i;
			i*=10;
			dec/=2;
		}
		System.out.println("the binary code :"+bin);

	}

}
