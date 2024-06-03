lpackage com.prudhvi.bintodecAnddectobin;

public class BintoDec {

	public static void main(String[] args) {
		int bin=101101;
		int i=1;
		int dec=0;
		while(bin>0) {
			int bit=bin%10;
			dec+=i*bit;
			i*=2;
			bin/=10;
	
		}
		System.out.println(dec);
	}

	}


