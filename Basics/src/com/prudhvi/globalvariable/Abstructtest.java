package com.prudhvi.globalvariable;


abstract class A{
	public abstract void m1();
	public abstract void m2();
	public void m3() {
		System.out.println("m3() define for class A");
		
	}
	
	
}
class B extends A{
	@Override
	public void m1() {
		System.out.println("m1() define for class B");
	}
	@Override
	public void m2() {
		System.out.println("m2() define for class B");
	}
	public void m4()  //specific method 
	{
		System.out.println("m4() define for class B");
	}
}
public class Abstructtest {

	public static void main(String[] args) {
		A a1=new B();
		a1.m1();
		a1.m2();
		a1.m3();
	//	a1.m4();    // not accessible
     // downcast
		/*
		 * perfom downcasting to 
		 * access
		 * specific propreties of the sub class
		 */
		((B)a1).m4();
	}

}
