package Stringprograme;

public class B {

	public static void main(String[] args) {
		int[] a= {1,3,454,68,46,4,8,6};
		sort(a);
		for(int v:a) {
			System.out.println(v);
		}
	}
	public static void sort(int[] a) {
		
		if(a.length==0) return;
		int[] l=new int[a.length/2];
		int[] r=new int[a.length-l.length];
		for(int i=0;i<l.length;i++) {
			l[i]=a[i];
		}
		for(int j=0;j<r.length;j++) {
			r[j]=a[l.length+j];
		}
		sort(l);
		sort(r);
		merge(l,r,a);
		
		}
	public static void merge(int[] a, int[] b, int[] c) {
		int i=,j=
		while(i<a.length && j<b.length) {
			
		}
		
		
	
	
	}


