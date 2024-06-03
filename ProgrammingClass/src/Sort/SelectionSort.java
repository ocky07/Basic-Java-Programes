 package Sort;

public class SelectionSort {
public static void main(String[] args) {
	int[] arr= {4,2,2,7,5,1,1,6,3};
	selectionSort(arr);
	
	for(int n:arr) {
		System.out.println(n);
	}
}
public static void selectionSort(int[] a) {
	
	for(int i=0;i<a.length-1;i++) {
		
		int min=i;
		for(int j=i+1;j<a.length;j++) {
			
			if(a[min]>a[j]) min=j;		
		}
	 int temp = a[i];
	 a[i]=a[min];
     a[min]=temp;
	}
}
}
