package Ds;
class Dog implements Animal{
	public void sound() {
		
		System.out.println("bow bow");

	}
}
class Cat implements Animal{
	public void sound() {
		System.out.println("meom meom");

	}
}
public class Test {

	public static void main(String[] args) {
		
	Animal[] a=new Animal[4];
	a[0]=new Dog();
	a[1]=new Cat();
	a[2]=new Dog();
	a[3]=new Dog();
	
	for(Animal n:a) {
		n.sound();
	}
	
	
	

	}

}
