package up$downCasting;
class A{
	public void m1()
	{
		System.out.println("Hi im m1() :class A");
	}
	public void m2() 
	{
		System.out.println("Hi im m2() :class A");
	}
}
class B extends A
{
	private int j=10;
	public B() {
		
	}
	public B(int j) {
		this.j=j;
	}
	
	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	

	@Override
	public String toString() {
		return "B [j=" + j + "]";
	}
	public void m1()
	{
		System.out.println("Hi im m1() :class B");
	}
	public void m3()
	{
		System.out.println("Hi im m3() :class B");
	}
}
public class Upcasting {
public static void main(String[] args){
	   A a=new B();
	   a.m1();    //only override methos and generic methods only call ?
	   a.m2();
	   
	   // a.m3();   specific methods we can't call the upcasting reference...
	   //a.j;
	 /*  B b=new B();
	   System.out.println(b.getJ());
	   b.m1();
	   b.m2();
	   b.m3();
	  System.out.println( b.toString());
	  b.setJ(20);
	 
	  System.out.println(b.getJ());
	 */
	   B b=(B)a;
	   b.m3(); //now we can access the specific method...
	   System.out.println(b.getJ());
	   System.out.println(b.hashCode()); //???? what is this code
	   b.m1();
	   b.m2();
	  System.out.println( b.toString());
	  // System.out.println(b.setJ(50)); //what happen here ? ? ?....
	  
	   
}
}
