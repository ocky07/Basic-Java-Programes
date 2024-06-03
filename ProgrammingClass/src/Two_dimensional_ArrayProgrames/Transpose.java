package Two_dimensional_ArrayProgrames;

public class Transpose {
public static void main(String[] args) {
	int [][] a= {{3,6,8},
			 {1,4,8},
			 {3,4,5}};
	int len=a.length;
	int[][] b=new int[len][len];
	for(int i=0;i<len;i++) {
		for(int j=0;j<len;j++) {
			
			b[j][i]=a[i][j];
		}
	}
	for(int[] temp:b) {
		for(int n:temp) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
}
}
