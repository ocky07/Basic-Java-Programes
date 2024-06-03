package ArrayProgrames;

public class HighestEleInArray {
public static void main(String[] args) {
	int [] arr= {4,5,6,95,3,2,1,0};
	int h=arr[0];
	for(int i=0;i<arr.length;i++) {
	if(arr[i]>h) h=arr[i];
}
	System.out.println(h);
  }
}
