package Numberprogrames;

import java.util.Scanner;
public class StrongNum_Range {
public static void main(String[] args) {
	int Temp, Sum = 0;
	 Scanner scn= new Scanner(System.in);
	//System.out.print("Enter th e Minimum value : ");
	//int num1= scn.nextInt();			
	System.out.print("Enter the Range value : ");
	int num2= scn.nextInt();	
	
	for(int i=0;i <=num2; i++)
	{
		Temp = i; 
		Sum = strong(Temp);
	
		if (i == Sum )System.out.println(i);
		
	}
}
public static int Factorial(int num)
{
	if (num == 0 || num == 1)
		return 1;
	else
	    return num * Factorial (num -1);
}
public static int strong(int num)
{
	int Temp, Reminder, Sum = 0, Factorial;
	
	for(Temp = num; Temp > 0; Temp = Temp /10)
	{
		Factorial = 1; 			
		Reminder = Temp % 10;
		Factorial = Factorial(Reminder);
		Sum = Sum + Factorial;
	}
	return Sum;
}
}
