package Sort;

public class Bobble {
public static void main(String[] args) {
	int[] arr= {6,9,0,2,4,1,3};
	
	sort(arr);
	System.out.println("The bobble sort algorithm :");
	System.out.print("[");
	for(int n:arr) {
		System.out.print(n+",");	
	}
	System.out.println("]");
}
public static void sort(int[] a) {
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
