package java2;

public class Stringtest {
	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody";
		String str2="Take me home";
		str=str1+str2;
		System.out.println(str);
		
		System.out.println("str1의 글자수: "+str1.length());
		System.out.println("str1의 d의 위치:"+str1.indexOf("d"));
		System.out.println("str1 모두 소문자로:"+str1.toLowerCase());
		System.out.println("str1 모두 대문자로"+str1.toUpperCase());
		
		
		System.out.println("str2의 글자수: "+str2.length());
		System.out.println("str2의 m의 위치:"+str2.indexOf("m"));
		System.out.println("str2 모두 소문자로:"+str2.toLowerCase());
		System.out.println("str2 모두 대문자로"+str2.toUpperCase());
	}
}
