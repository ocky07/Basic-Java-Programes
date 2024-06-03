package com.prudhvi.THIS;

class A
{
	int x;
	int y;
	int z;
	
	public A() {
	
	//  this(10,20);
	}
	public A(int x, int y) {
		// this(30,20,30);
		
		this.x = x;
		this.y = y;

	}
	public A(int x,int y,int z) {
		//this();
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	
	public void mx() {
		System.out.println("i'm mx method for class A");
		this.my();
		
	}
	public void my() {
		System.out.println("i'm my method for class A");
		//this.mx();
		// A.mz();      // static methods we can call the class instance reference..
	}
	public static void mz() {
		System.out.println("i'm mz method for class A");
		// this.mx();this key word can't used static content...
	}
	
}
class B extends A
{
	int i;
	int j;
	int k;
	public B() 
	{
		super();			//call to super
		
		
	}
	public B(int i, int j) 
	{	//super(i, j);			//call to super
		this.i = i;
		this.j = j;
	}
	public B(int i,int j,int k) {
		//super(i, j, k);			//call to super
		this.i=i;
		this.j=j;
		this.k=k;
	}
	
	public void mi() {
		System.out.println("i'm mi method for class B");
		// super.mx();
		// super.my();      // call to super by instance methodsin super class
	}
	public void mj() {
		System.out.println("i'm mj method for class B");
	}
	public static void mk() {
		System.out.println("i'm mk method for class B");
		
		//super.mx();		//we can not used the super in the static block
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1);
		
	}

}
