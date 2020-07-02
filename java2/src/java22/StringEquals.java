package java2;

public class StringEquals {
	public static void main(String[] args) {
		String string1=new String("이효진");
		String string2="이효진";
		String string3=string1;
		if(string1==string2) System.out.println("they are same");
		else System.out.println("they are not same");
		
		
		if(string1.equals(string2)) System.out.println("its content are same");
		else System.out.println("they content are not same");
		
		if(string1==string3) System.out.println("input are same");
		else System.out.println("input not same");
	}
}
