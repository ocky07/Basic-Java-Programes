package ArrayProgrames;

public class DivisionInArray {
public static void main(String[] args) {
	double []arr= {4,6,5,8,9,2,1,3};
	int div=2;
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i]/div;
	}
	for(double n:arr) {
		System.out.println(n+",");
	}
	
}
}
