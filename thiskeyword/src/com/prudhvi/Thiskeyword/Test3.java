package com.prudhvi.Thiskeyword;
class Rectangle{
	int length;
	int breath;
	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	void display() {
		System.err.println("length="+length);
		System.err.println("breath="+breath);
	}
	
}

public class Test3 {
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(10, 20);
		r.display();
	    Rectangle r1=new Rectangle(100, 200);
	    r1.display();
	}

}
