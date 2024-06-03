package com.prudhvi.programpack;

import java.util.Scanner;

public class MenuDreivenSoftware {
	public static void main(String[] args) 
	{
		System.out.println("PRUDHVI Calculator Software...!");
		
		for(;;)
		{
			System.out.println("1. Factorial of a number \n"
					+ "2. Length of a number \n"
					+ "3. Power of a number \n"
					+ "4. Reverse of number \n"
					+ "5. ArmStrong of a number \n"
					+ "6. Strong Number \n"
					+ "7. Sum of reverse of first 3 digits \n"
					+ "8. Range of Armstrong Numbers \n"
					+ "9. Range of Strong Numbers\n");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Choice: ");
			int choice = scan.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Factorial");
				System.out.println("Enter the number: ");
				int num = scan.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int result = Utility.factorial(num);
					System.out.println(num + " != " + result);
				}
			}
			else if(choice == 2)
			{
				System.out.println("Length");
				System.out.println("Enter the number: ");
				int num = scan.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int result = Utility.length(num);
					System.out.println("The length of " + num + " is " + result);
				}
				
			}
			else if(choice == 3)
			{
				System.out.println("Power");
				
				System.out.println("Enter the base: ");
				int base = scan.nextInt();
				
				System.out.println("Enter the Exponent");
				int exp = scan.nextInt();
				
				int result = Utility.power(base, exp);
				System.out.println("The power is " + result);
			}
			else if(choice == 4)
			{
				System.out.println("Reverse");
				
				System.out.println("Enter the number: ");
				int num = scan.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int result = Utility.reverse(num);
					System.out.println(num + " reverse is " + result);
				}
			}
			else if(choice == 5)
			{
				System.out.println("Check Armstrong");
				
				System.out.println("Enter the number: ");
				int num = scan.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int result = Utility.armStrong(num);
					if(num == result) System.out.println("Armstrong");
					else System.out.println("Not Armstrong");
				}
			}
			else if(choice == 6)
			{
				System.out.println("Check Strong");
				
				System.out.println("Enter the number: ");
				int num = scan.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int result = Utility.strong(num);
					if(num == result) System.out.println("Strong");
					else System.out.println("Not Strong");
				}
				
			}
			else if(choice == 7)
			{
				System.out.println("Sum of reverse");
				
				System.out.println("Enter the number: ");
				int num = scan.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int result = Utility.reverseSum(num);
					System.out.println(num + " reverse sum is " + result);
				}
			}
			else if (choice == 8)
			{
				System.out.println("Range of Armstrong");
				
				System.out.println("Enter the Series: ");
				int range = scan.nextInt();
				
				for(int i=1;i<=range;i++)
				{
					if(i==Utility.armStrong(i)) System.out.println(i);
				}
			}
			else if(choice == 9)
			{
				System.out.println("Range of Strong");
				
				System.out.println("Enter the Series: ");
				int range = scan.nextInt();
				
				for(int i=1;i<=range;i++)
				{
					if(i==Utility.strong(i)) System.out.println(i);
				}
			}
			else
			{
				System.out.println("Sir/Madam your choice is incorrect");
				System.out.println("That's Okay Try once Again");
				System.out.println("Thank you...!");
			}
			System.out.println("Do you want to continue? Yes/No");
			char ch = scan.next().charAt(0);
			if(ch == 'y' || ch == 'Y') continue;
			else
			{
				System.out.println("Thank you for using my software...!");
				System.out.println("Visit Again");
				break;
			}
		}
	}

}

