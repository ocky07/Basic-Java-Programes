package com.prudhvi.Thiskeyword;
class Student {
    String name;
    long phnonum;
    
    void updatephonenum(long phnum) {
   	 this.phnonum=phnum;
   	 System.out.println(phnum+"\nphonenumber is update");
    }
    
}

public class Test2 {
	public static void main(String[] args) {
		Student s1=new Student();
		//System.out.println(s1);
		s1.name="prudhvi";
		s1.phnonum=56932945;
		s1.updatephonenum(999999999);
		//System.out.println(s1.phnonum);
	}
}

