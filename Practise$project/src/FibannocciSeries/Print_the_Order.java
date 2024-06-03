package FibannocciSeries;

public class Print_the_Order {

	public static void main(String[] args) {
		
		
		int a=0,b=1,c=0,i;
		
		for(i=0;i<=100;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
