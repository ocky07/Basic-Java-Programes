package ArrayProgrames;

public class SmalleastElementInArray {
public static void main(String[] args) {
	
	int arr[]= {1,23,65,94,6,5,8};
	int s=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<s) s=arr[i]; 
	}
	System.out.println(s);
	
}
}
