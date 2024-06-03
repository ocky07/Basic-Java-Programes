package Stringprogrames;

public class Reverse_String {
public static void main(String[] args) {
	String s="java";
	int count=0;
	char[] ch=s.toCharArray();
	for(int s1=ch.length-1;s1>=0;s1--) {
		System.out.print(ch[s1]);
	}
	
}
}
