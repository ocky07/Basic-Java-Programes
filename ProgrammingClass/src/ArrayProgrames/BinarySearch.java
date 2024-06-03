package ArrayProgrames;

public class BinarySearch {
public static void main(String[] args) {
	int[] arr= {4,6,95,5,63,22,15};
	int ele=22;
	System.out.println(binarySearch(arr,ele));
}
public static int binarySearch(int[] a,int e) {
	int f=0,l=a.length-1;
	while(f<=l) {
		int mid=(f+l)/2;
		if(e==a[mid]) return mid;
		else if(e<a[mid]) l=mid-1;
		else f=mid+1;
	}
	return -1;
}
}
