package com.prudhvi.object;

public class GetandSet {
	private int i;
	public int getI() {
		return i;
	}
	public void set(int i) {
		this.i=i;
	}
}
class test{
	public static void main(String[] args) {
		GetandSet obj=new GetandSet();
		System.out.println(obj.getI());
		
	}
}

