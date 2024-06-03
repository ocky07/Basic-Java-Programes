package com.prudhvi.objectpack;

public class Tostring {
    
	 String name;
	  String rollno;
	  Tostring(String name,String rollno){
		  this.name=name;
		  this.rollno=rollno;
	  }
	public static void main(String[] args) {
	      Tostring st1=new Tostring("prudhvi"," 183477gs");
	      String p="raj";
	      System.out.println(st1.toString());
	      System.out.println(p.toString());
	}

}
