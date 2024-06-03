package Sort;

public class InsertionSort {
public static void main(String[] args) {
	
	int[] arr= {99,88,77,66,11,44,33,22};
	insertSort(arr);
	for(int n:arr) {
		System.out.println(n);
	}
	
}
public static void insertSort(int[] a) {
	
	for(int i=1;i<a.length;i++) {
		
		int key=a[i];
		int j=i-1;
		while(j>=0&&a[j]>key) {
		
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
		
	}
	
}
}
