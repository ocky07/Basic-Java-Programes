package Two_dimensional_ArrayProgrames;

public class Mul {
public static void main(String[] args) {
	int [][] a= {{3,6,8},
			 	 {1,4,8},
			 	 {3,4,5}};
	int [][] b= {{2,2,2},
			     {2,2,2},
			     {2,2,100}};
	  int[][] c=mul(a,b);
	  
	  for(int[] temp:c) {
		  for(int n:temp) {
			  System.out.print(n+" ");
		  } 
		  System.out.println();
	  }
}
public static int[][] mul(int[][] a,int[][] b){
	int len=a.length;
	int[][] c=new int[len][len];
	for(int i=0;i<len;i++) {
		for(int j=0;j<len;j++) {
			for(int k=0;k<len;k++) {
				c[i][j]=a[i][k]*b[k][j];
			}
		}
	}
	return c;
}
	
}
