package java23;

public class newInstance {
	public static void main(String[] args) throws 
	ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1=new Person();
		System.out.println(person1);
		
		Class<?> perClass=Class.forName("java23.Person");
		
		Person person2=(Person)perClass.newInstance();
		System.out.println(person2);
	}
}
