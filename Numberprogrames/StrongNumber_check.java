package Numberprogrames;
import java.util.Scanner;
public class StrongNumber_check {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
		int Temp, Sum = 0, i, Factorial;
		System.out.print("Please Enter Number Sir/Madam:('-') ");
	int Number = sc.nextInt();		
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1;i = 1; 
		  int digit = Temp % 10;
		    while (i <= digit)
		    {
		   Factorial = Factorial * i;
		     	i++;
		    }
		     Sum+=Factorial;
		     Temp/=10;
		     }
		if ( Number == Sum )System.out.println("This is Strong number: "+Number);
		else System.out.println("\n " + Number + " is Not a Strong Number");
}
	}
