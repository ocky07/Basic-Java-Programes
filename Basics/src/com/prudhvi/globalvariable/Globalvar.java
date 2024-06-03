package com.prudhvi.globalvariable;

public class Globalvar {
	static int p;				//variables or data members or global variables or fields 
	int s;					

	public static void main(String[] args) {
		int i=0;							// local variable of integer value
		boolean j=true;						// local variable of the boolean value
		String str="prudhvi";				// local variable of the string value
		
		----------------------------------
		Globalvar g=new Globalvar();		// the class object is created and also reference
		
		
		int q ;								//non-static variable not decleared... {if you are decleared the non static variable in a static method then it is not a global variable.It is local variable}
		static int r=4;						// static variable is decleared...
		static t;							// static variable not decleared..
		
		System.out.println(q);				//no out put
		System.out.println(r);				//no out put
		Syste.out.println(t);				//no out put
		
		System.out.println(g.q);
		System.out.println(g.r);
		Syste.out.println(g.t);
		----------------------------
		System.out.println(i);				//to print local variable of integer value
		System.out.println(j);				//to print local variable of the boolean value
		System.out.println(str);			//to print local variable of the string value
	
		

	}
	public static void m1() 				// static method 
	{
		System.out.println(p);				// the static method can be allowed static global variable ..
		System.out.println(s);				// the static method can not be allowed non-static gloabal variable..
		
	}
	public void m2() 						//non - static method
	{
		System.out.println(s);				// the non static method can be allowed static global variable and
		System.out.println(p);				// the non static method can be allowed non static globle variable 
	}

}
