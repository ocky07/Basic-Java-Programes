package com.prudhvi.constructor;


class A1{
	{
		System.out.println("goodmornning...");
	}
	{
		System.out.println("goood day");
	}
	public A1() 
	{
		System.out.println("no args const");
	}
	public A1(String name)
	{
		System.out.println("have a good day..:"+name);
	}
	class B1 extends A1
	{
		{
			System.out.println("GOOD evng");
		}
		public B1() {
			System.out.println("NO args constr");
		}
		
	}
}
public class Test1 {

	public static void main(String[] args) {
	//	new A1();
	// new A1("Baby attraction");
		new B1();

	}

}
