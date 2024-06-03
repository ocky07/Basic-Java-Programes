package Sort;

public class QueckSort {
public static void main(String[] args) {
	
	int[] arr= {4,6,5,8,9,0,1,2,3};
	qSort(arr,0,arr.length-1);
	
	for(int n:arr) {
		System.out.println(n);
	}
}
public static void qSort(int[] a,int start,int end) {
	int pivot=a[(start+end)/2];
	
	int i=start,j=end;
	while(i<=j) {
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
		if(i<=j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++; 
		j--;
		qSort(a,start,j);
		qSort(a,i,end);
	} 
}
	}
}
