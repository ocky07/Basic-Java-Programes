package Stringprogrames;
import java.util.Scanner;
public class String_Pallindrome_check {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Word :");
	String s=scn.next();
	char[] arr=s.toCharArray();
	int i=0,j=arr.length-1;
	while(i<j) 
	{
		if(arr[i]!=arr[j]) System.out.println("This String is not");
		i++;
		j--;
	}
	System.out.println("This word is pallindrome :\n"+s);
		
	}
}