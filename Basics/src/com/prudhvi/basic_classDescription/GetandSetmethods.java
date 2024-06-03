package com.prudhvi.basic_classDescription;

public class GetandSetmethods {

	private int i;
	public int getI() {
		return i;
	}
	public void set(int i) {
		this.i=i;
	}
	public static void main(String[] args) {
		GetandSetmethods obj=new GetandSetmethods();
		System.out.println(obj.getI());
		obj.set(10);
		System.out.println(obj.getI());
		
	}
}




