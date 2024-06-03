package ArrayProgrames;

public class A2 {
public static void main(String[] args) {
 int[] arr= {1,0,3,9,6,5,12,56}; // this array is not in order...{Lets do the linear search}
  int ele=13;
  System.out.println(linearSearch(arr,ele));
  
}
public static boolean linearSearch(int[] a,int ele) {
	
	for(int i=0;i<a.length;i++) {
		
		if(a[i]==ele) return true;
	}
	return false;
}
}
