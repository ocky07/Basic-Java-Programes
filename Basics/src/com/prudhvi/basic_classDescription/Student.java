package com.prudhvi.basic_classDescription;

public class Student {
    int id;
    String name;
    String age;
	public Student(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
}
class test9 implements Comparable 
{
	comparable<Student>
}