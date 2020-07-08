package java29.staticex;



public class Main {
	public static void main(String[] args) {
		A a=new A();
		
		// Instant member class object creation
		A.B b=a.new B();
		
		b.field1=3;
		b.method1();
		
		//static member class object creation
		A.C c=new A.C(); // because C is static you cannot use object a
		c.field1=5;
		c.method1();
		A.C.field2=7;
		A.C.method2();
		
		
		a.method();
		
	}
}
