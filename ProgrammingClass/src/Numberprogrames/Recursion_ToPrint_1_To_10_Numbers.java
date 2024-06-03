package Numberprogrames;
import java.util.Scanner;
public class Recursion_ToPrint_1_To_10_Numbers {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number Range Sir/Madam :('-')");
	int num=scn.nextInt();
	Recursion_ToPrint_1_To_10_Numbers s=new Recursion_ToPrint_1_To_10_Numbers();
	s.range(num,1);
}
public  int range(int num,int i) {
	if(i<=num) {
		System.out.println(i+" ");
		return range(num,++i);
	}
	return 1;
	
}
}
