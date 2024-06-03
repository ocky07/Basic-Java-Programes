package com.prudhvi.equalshashcodedemo;

public class EqualsHashCodeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "prudhvi");
		
		Employee e2=new Employee(1, "prudhvi");
		System.out.println(e1.equals(e2));

	}
}
class Employee extends Object 
{
	private int id;
	private String name;
	private double salary;
	
	
public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if (obj==null)return false;
		if(getClass()!=obj.getClass()) return false;
		Employee other=(Employee) obj;
		if(id!=other.id) return false;
		if(name==null) {
			if(other.name!=null) return false;
			
		}
		else {
			if(!name.equals(other.name)) return false;
		
			
		}
		return true;
		
		
	}
	}
