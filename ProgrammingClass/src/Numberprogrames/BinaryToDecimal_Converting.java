package Numberprogrames;

import java.util.Scanner;

public class BinaryToDecimal_Converting {
public static void main(String[] args) {
   Scanner scn=new Scanner(System.in);
   System.out.println("enter the binary ");
   int i=1,dec=0, bin=scn.nextInt();
   
   while(bin>0) {
	   int bit=bin%10;
	   	dec+=bit*i;
	   	i*=2;
	   	bin/=10;
   }
   System.out.println(dec);
   
}
}
