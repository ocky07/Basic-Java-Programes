package Numberprogrames;

class CaseConvertion {

	public static void main(String[] args) {
		String s="Jaava";
		String temp="";
		for(int i=0;i<s.length()-1;i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				temp+=Character.toLowerCase(c);
				
			}else temp+=Character.toUpperCase(c);
		}
		System.out.println(temp);

	}

}
