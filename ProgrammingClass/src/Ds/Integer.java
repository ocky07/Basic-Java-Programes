package Ds;

public class Integer {
 private int i;
 
 public Integer(int i) {
	this.i=i;
}
 public int intvalue() {
	 return i;
 }
 public static void main(String[] args) {
	Integer a=new Integer(9);
	System.out.println(a.intvalue()*5);
	Integer b=new Integer(2);
	
	System.out.println(b.intvalue()*3);
}
}
