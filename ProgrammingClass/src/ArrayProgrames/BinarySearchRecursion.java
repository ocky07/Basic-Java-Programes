package ArrayProgrames;

public class BinarySearchRecursion {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9};
	int ele=9;
	System.out.println(bSR(arr,ele,0,arr.length));
}
public static int bSR(int[] a,int e,int first,int last) {

	if(first>last) return -1;
	int mid=(first+last)/2;
	if(e==a[mid]) return mid;
	else if(e<a[mid])return bSR(a,e,first,mid-1);
	else {
		return bSR(a,e,mid+1,last);
	}
}
}