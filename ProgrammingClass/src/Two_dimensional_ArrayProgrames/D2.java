package Two_dimensional_ArrayProgrames;

public class D2 {
public static void main(String[] args) {
	
	int[][] a=new int[3][];	
	a[0]=new int[4];
	a[1]=new int[5];
	a[2]=new int[3];
	
	
	for(int[] t:a) {
		
		for(int n:t) {
			System.out.print(n);
		}
		System.out.println();
	}
}
}
