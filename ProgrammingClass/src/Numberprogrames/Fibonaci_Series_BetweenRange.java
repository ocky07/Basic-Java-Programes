 	package Numberprogrames;

import java.util.Scanner;

public class Fibonaci_Series_BetweenRange {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the first value: ");
	int first=scn.nextInt();
	System.out.println("Enter the last value: ");
	int last=scn.nextInt();
	fibonacciBetweeen(first,last );
}
public static void fibonacciBetweeen(int min, int max) {
    int n1 = 1, n2=1, aux=0;
    while((aux=n1+n2) < min){
        n1=n2;
        n2=aux;
    }
    while( (aux=n1+n2) <= max){
        System.out.print(aux+" ");
        n1=n2;
        n2=aux;
    }
}
}
