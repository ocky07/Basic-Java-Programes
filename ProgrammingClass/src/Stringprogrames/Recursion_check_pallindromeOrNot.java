package Stringprogrames;

import java.util.Scanner;

import org.junit.runner.JUnitCommandLineParseResult.CommandLineParserError;

public class Recursion_check_pallindromeOrNot {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the String word Sir/Mdam:('-')");
	String s=scn.next();
	isPallindrome(String s);
}
public static boolean isPallindrome(String s) {
	char[] ch=s.toCharArray();
	int i=0,j=ch.length-1;
	if(ch[i]!=ch[j]) return false;
	if(Compare(ch[i]==ch[j])) 
		
		
	return ispallindrome();
	
}

}
