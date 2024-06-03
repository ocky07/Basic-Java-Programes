package com.prudhvi.instancevar;

public class Student {
	public String name;
	private int marks;
	public Student(String studname) {
		this.name=studname;
	}
	public void setmarks(int studmarks) {
		this.marks=studmarks;
	}
	//this method to print the student details.
	public void printstud() {
		System.out.println("name: \n"+name+"\nmarks: "+marks);
	
	}
	public static void main(String[] args) {
		Student st1=new Student("ocky");
		Student st2=new Student("thriveni");
		Student st3=new Student("srivalli");
		st1.setmarks(100);
		st2.setmarks(90);
		st3.setmarks(15);
		st1.printstud();
		st2.printstud();
		st3.printstud();
	
	}
	

}
