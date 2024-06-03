package com.prudhvi.constructor;

class Doctor extends human
{
	String name;
	int age;
	String specialized;
	public Doctor(String name,int age,String specialized) {
		super(name);
		this.name=name;
		this.age=age;
		this.specialized=specialized;
	}
	
}
class human
{
	String name;
	public human(String name) {
		this.name=name;
		
	}
	
}
public class CreatingDoctor {
	

	public static void main(String[] args) {
		

	}

}
