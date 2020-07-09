package java30.lambda;

public class StringConCatTest {

	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		
		//객체지향식
		
		StringConCatImpl SCCI=new StringConCatImpl();
		
		SCCI.makeString(s1, s2);
		
		//람다식
		StringConCat concat2=(s,v)->System.out.println(s+" "+v);
		concat2.makeString(s1, s2);
		
		// annonymous class
		StringConCat concat3=new StringConCat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+" "+2);
			}
		};
		concat3.makeString(s1, s2);
		
	}

}
