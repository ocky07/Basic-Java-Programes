package com.prudhvi.Thiskeyword;

public class Test {

	static int i;
	static int j;
	public Test(int i) {
		this.i=i;
	}
	public void Test1(int j) {
		this.j=j;
	}
	@Override
	public String toString() {
		
		return ""+i;
	}
	public void m1() 
	{
		System.out.println("hello");
		
	}
	public void m2()
	{
		this.m1();
		this.i=10;
		Test.m3();
		Test.j=20;
	}

	public static void m3() {
		System.out.println("bye");
	}
  public static void main(String[] args) {
	Test t=new Test(i);
	t.m2();
	System.out.println(t);
  }
}
