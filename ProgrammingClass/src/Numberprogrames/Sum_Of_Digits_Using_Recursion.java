package Numberprogrames;

import java.util.Scanner;

public class Sum_Of_Digits_Using_Recursion {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("eneter the number Sir/Madam :('-')");
	int num=scn.nextInt();
	Sum_Of_Digits_Using_Recursion r=new Sum_Of_Digits_Using_Recursion();
	
	System.out.println(r.sumDidits(num));
}
public int sumDidits(int i)
{
	if(i==0) return 0;
	return (i%10+sumDidits(i/10));
}
}
