package com.prudhvi.programpack;

public class Utility {
		public static int factorial(int num)
		{
			int fact = 1;
			for(int i=1;i<=num;i++) fact*=i;
			return fact;
			
		}
		
		public static int length(int num)
		{
			int len = 0;
			for(;num!=0;len++) num/=10;
			return len;	
		}
		
		public static int power(int base,int exp)
		{
			int res = 1;
			for(int i=1;i<=exp;i++) res = res * base;
			return res;
			
		}
		public static int reverse(int num)
		{
			int res = 0;
			for(;num>0;num/=10) res = res * 10 + (num % 10);
			return res;
		}
		
		public static int armStrong(int num)
		{
			int l = length(num);
			int res = 0;
			for(;num>0;num/=10) res = res + power(num%10, l);
			return res;
		}
		
		public static int strong(int num)
		{
			int res = 0;
			for(;num>0;num/=10) res = res + factorial(num%10);
			return res;
		}
		
		public static int sum(int num)
		{
			int res = 0;
			for(;num>0;num/=10) res = res + num % 10;
			return res;
		}
		public static int reverseSum(int num)
		{
			int res = 0; 
			int reverseNum = reverse(num);
			while(reverseNum>0)
			{
				if(length(reverseNum)!=3) reverseNum/=10;
				else return sum(reverseNum);	
			}
		   return -1;
		}


}
