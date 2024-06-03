package prime;

public class Prime2 {
	 public static void main(String[] args) {

		  int num =1000, count;
         
          int primenum=0; //sum
		  for (int i = 1; i <= num; i++) {//
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }
		   if (count == 0) {
			   
			   primenum+=i;
			   
		   }
		  
		  }
		  System.out.println("The out put primesum:"+primenum);
		 }
}
