package ArrayProgrames;

public class MultiplicationInArray {

	public static void main(String[] args) {
	int [] arr= {2,4,3,1,2,6};
     int mul=2;
     for(int i=0;i<arr.length;i++) {
    	 
    	 arr[i]=arr[i]*mul;
     } 
     
     System.out.print("[");
     for(int n:arr) {
    	 System.out.print(n+",");
     }
     
     System.out.print("]");
	}

}
