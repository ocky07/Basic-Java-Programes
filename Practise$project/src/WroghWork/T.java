package WroghWork;

import WroghWork.T.P.Q;    //  ???? Why we are importting here (same package!)

public class T {

	static class P   //extends q  ?? what happen internal 
	 {
		static int i;
		int j;
		public static void mi() {
			System.out.println("i'm static inner class of p static method:m1 form outer class of T");
		}
		public void mj() {
			System.out.println("i'm inner class of p non-static method:mx form outer class of T");
		}
		
    ///////////////////		
		
		public class Q  // extends p !! non static can be allowed the the static class
		  {
			static int x;
			int y;
			public void mx() {
				System.out.println("i'm non-static inner class of q non-static method:m3 form outer class of T");
			}
			public static void my() {
				System.out.println("i'm non-static inner class of q non-static method:m3 form outer class of T");
			}
		}
	}
public static void main(String[] args) {
		
		T.P.mi();
		T.P.i=10;
		
		T.P p1=new T.P();
		p1.j=20;
		p1.mj();
////////////////////////////////
		Q.x=10;     //static field
		Q.my();    //static method
		
  // ?How to access the Q class non static method	
	
		T t = new T();
		Q  q1= t.new Q(); // ?? how to create the object in the Q class
	    q1.mx();
	}
}

