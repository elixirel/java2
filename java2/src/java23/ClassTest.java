package java23;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person=new Person();
		// Object�� getclass();
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		
		//Ŭ������ �����ؼ� class �̸��� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("java23.Person");
		
		System.out.println(pClass3.getName());
	}
}
