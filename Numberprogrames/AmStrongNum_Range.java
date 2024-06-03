package Numberprogrames;
import java.util.Scanner;
public class AmStrongNum_Range {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the range Sir/Madam: ('-')");
	int range=scn.nextInt();
	for(int i=1;i<=range;i++) {
		int temp=i,count=0,sum=0;
		while(temp>0) {temp/=10; count++;}
		temp=i;
		while(temp>0) {
			int bit=temp%10;
			sum+=Math.pow(bit,count);
			temp/=10;
		}
		if(i==sum)System.out.println(i);
	}
}
}
