package com.prudhvi.bintodecAnddectobin;

public class DectoBin {

	public static void main(String[] args) {
		int dec=2;
		int bin=0;
		int i=1;
		while(dec>0) {
			int bit=dec%2;
			bin+=i*bit;
			i*=10;
			dec/=2;
		}
		System.out.println(bin);

	}

}
