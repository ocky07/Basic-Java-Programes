package Numberprogrames;
// Using Ternory operator :completed
import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enetr the number Sir/Madam ('-'): ");
	int num=scn.nextInt();
	int result=(num%2==0)?1:0;
	if(result==0)System.out.println("odd");
	else System.out.println("even");
	}
		
		// System.out.println("even");
	//else System.out.println("odd");
}


