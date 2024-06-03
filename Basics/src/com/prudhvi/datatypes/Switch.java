package com.prudhvi.datatypes;

import java.util.Scanner;

public class Switch {
	   
		public static void main(String[] args) {    
		    Scanner scn=new Scanner(System.in); 
		    System.out.println("enter the character");
		    String ch=scn.nextLine();
		   
		    switch(ch)  
		    {  
		        case ("a"):   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "e":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "i":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "o":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "u":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "A":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "E":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "I":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "O":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        case "U":   
		            System.out.println("Vowel: "+ch);  
		            break;  
		        default:   
		            System.out.println("Consonant: "+ch);  
		    }  
		}    
		}  
