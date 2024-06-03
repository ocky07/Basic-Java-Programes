package ArrayProgrames;

public class SecondSmallEleInArray {
public static void main(String[] args) {
	int[] arr= {4,5,44,8,14,6,3};
	int s1=arr[0],s2=arr[0];
	for(int i=0;i<arr.length;i++) {
	
		if(arr[i]<s1) { s1=arr[i];
		s2=s1;
		s1=arr[i];
		}else if(arr[i]<s2 || s1==s2) {
			s2=arr[i];
		}
	
}
	System.out.println(s2);
}}
