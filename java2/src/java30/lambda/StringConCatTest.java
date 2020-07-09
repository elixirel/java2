package java30.lambda;

public class StringConCatTest {

	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		
		//��ü�����
		
		StringConCatImpl SCCI=new StringConCatImpl();
		
		SCCI.makeString(s1, s2);
		
		//���ٽ�
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