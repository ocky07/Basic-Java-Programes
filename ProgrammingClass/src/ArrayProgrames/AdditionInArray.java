package ArrayProgrames;

public class AdditionInArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,9,8,7}; 
	int sum=0;
	for(int n:arr) {
		 sum+=n;
	}
	System.out.println(sum);
}
}
