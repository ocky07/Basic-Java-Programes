package Statementsprog;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int cash=s.nextInt();
		if(cash>=2000) {
			System.out.println(cash/2000);
			cash=cash%2000;
		}
		if(cash>=500) {
			System.out.println(cash/500);
			cash=cash%500;
			
		}
		if(cash>=200) {
			System.out.println(cash/200);
			cash=cash%200;
		}
		if(cash>=100) {
			System.out.println(cash/100);
			cash=cash%100;
		}
		else {
			if(cash==0) System.out.println("eneter the saficient amount sir or madam\n"+"\tplease check it onces");
		}

	}

}
