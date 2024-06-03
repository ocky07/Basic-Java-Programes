package com.prudhvi.Thiskeyword;

class Stu{
	int id ,marks;String name,Class;long phno;

	public Stu(int id,String name, String class1,int marks, long phno) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.Class = class1;
		this.phno = phno;
	}
	
	@Override
	public String toString() {
		return "Stu id :" + id + "\n marks :"  + "\n name :" + name + "\nClass :" + Class + "\n phno :" + phno ;
	}

}
public class Test4 {
     public static void main(String[] args) {
		
	
	Stu s=new Stu(1023, "prudhvi", "G force", 100, 999999);
	System.out.println(s);
	Stu s1=new Stu(2335, "prudh",  "fforce", 33, 45915415);
	System.out.println(s1);

}
  }
