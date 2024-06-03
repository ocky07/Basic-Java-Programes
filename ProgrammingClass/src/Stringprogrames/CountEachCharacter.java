package Stringprogrames;

public class CountEachCharacter {
public static void main(String[] args) {
	String s="RamAn@123";
	int count=0;
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		
		if(c>='0' && c<='9') {
			count++;
		}
		else if(c>='a' && c<='z') {
			count++;
		}
	}
	System.out.println(count);
}
}
