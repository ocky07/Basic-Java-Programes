package Numberprogrames;
//Using the ternoay operator :completed
import java.util.Scanner;

public class Greatest {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enetr the number 3:Sir/madam ('-')");
	int temp,greatest;
	int num1=scn.nextInt();
	int num2=scn.nextInt();
	int num3=scn.nextInt();
	temp=(num1>num2)? num1:num2;
	greatest=(temp>num3)?temp:num3;
	System.out.println("The greatest number is: "+greatest);
}
}
