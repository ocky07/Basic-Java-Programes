package Numberprogrames;

import java.util.Scanner;

public class DecimalToBinary_converting {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Pass the Decimal Value Sir/Madam : ('-')");
	int i=1,bin=0, dec=scn.nextInt();
	while(dec>0) {
		int digit=dec%2;
		bin+=digit*i;
		dec/=2;
		i*=10;
	}
	System.out.println(bin);
}
}
