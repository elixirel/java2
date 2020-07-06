package java23;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person=new Person();
		// Object의 getclass();
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		
		//클래스가 접근해서 class 이름을 획득
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3=Class.forName("java23.Person");
		
		System.out.println(pClass3.getName());
	}
}
