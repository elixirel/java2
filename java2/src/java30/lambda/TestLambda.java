package java30.lambda;

interface PrintString{
	void showString(String str);
}
public class TestLambda {

	public static void main(String[] args) {
		
		PrintString str=x->System.out.println(x);
		str.showString("hello lambda_1");
		
		showMyString(str); // is eqv. to showMyString(x->System.out.println(x));
		
		
		PrintString reStr=returnString();
		reStr.showString("hello");
	}
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		 return s->System.out.println(s);
	}
}
