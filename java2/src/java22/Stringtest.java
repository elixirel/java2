package java2;

public class Stringtest {
	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody";
		String str2="Take me home";
		str=str1+str2;
		System.out.println(str);
		
		System.out.println("str1�� ���ڼ�: "+str1.length());
		System.out.println("str1�� d�� ��ġ:"+str1.indexOf("d"));
		System.out.println("str1 ��� �ҹ��ڷ�:"+str1.toLowerCase());
		System.out.println("str1 ��� �빮�ڷ�"+str1.toUpperCase());
		
		
		System.out.println("str2�� ���ڼ�: "+str2.length());
		System.out.println("str2�� m�� ��ġ:"+str2.indexOf("m"));
		System.out.println("str2 ��� �ҹ��ڷ�:"+str2.toLowerCase());
		System.out.println("str2 ��� �빮�ڷ�"+str2.toUpperCase());
	}
}
