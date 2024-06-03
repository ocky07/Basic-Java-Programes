package Two_dimensional_ArrayProgrames;

public class Addition {
public static void main(String[] args) {
	
	int [][] a= {{3,6,8},
				 {1,4,8},
				 {3,4,5}};
	int sum=0;
	int len=a.length;
	for(int i=0;i<a.length;i++) {
		sum=a[i][i];
		if(len%2!=0 && i==len/2) continue;
		sum+=a[i][len-1-i];
	}
	System.out.println(sum);
	
	
			}
}
