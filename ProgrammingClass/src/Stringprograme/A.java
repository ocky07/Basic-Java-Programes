package Stringprograme;

public class A {
		
	
	
	public static void main(String[] args) {
		int[] a= {1,4,65,8,9};
		SelectionSort(a);
		for(int v:a) {
			System.out.println(v);
		}
	

	}
	public static void SelectionSort(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=1;j<a.length-1-i;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			}
		}
		
		
	}


