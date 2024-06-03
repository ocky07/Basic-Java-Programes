package com.prudhvi.constructor;



class Car
	{
	String name;
	int carno=369;
	String color;
	{
		carno++;
	}
	public Car(String name,String color) {
		this.name=name;
		 this.color =color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", carno=" + carno + ", color=" + color + "]";
	}
	
}
public class CarDevp {

	public static void main(String[] args) {
		Car 

	}

}
