package WroghWork;

public class Outer {
	
	public class InnerClass{
		public void m1() {
			System.out.println("Inner class");
		}
	}

  public static void main(String[] args) {
	Outer outer = new Outer();
	InnerClass innerClass = outer.new InnerClass();
	innerClass.m1();
}

}
