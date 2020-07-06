package java12;

public class CharArray2 {
	public static void main(String[] args) {
		char[] alphabets=new char[26];
		
		char ch='A';
		
		for(int i=0;i<alphabets.length;i++) {
			alphabets[i]=(char) (ch+i);
		}
		
		for(char c:alphabets) {
			System.out.println(c);
		}
	}
}
