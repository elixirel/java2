package java22;

public class ObjectCloneTest  {
	public static void main(String[] args) throws CloneNotSupportedException  {
	
		Circle circle=new Circle(10,20,3);
		
		Circle copyCircle=(Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
