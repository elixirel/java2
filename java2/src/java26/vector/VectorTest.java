package java26.vector;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Object obj;
		Vector<Object> vec=new Vector<Object>(2); // vector ���� with size 2
		obj=10;
		vec.addElement(obj); // element add
		
		System.out.println(vec.capacity()); // vector�뷮 check
		System.out.println(vec.size()); //vector size check
		System.out.println("-----------------------");
		
		obj="hello";
		vec.addElement(obj);
		System.out.println(vec.capacity()); // vector�뷮 check
		System.out.println(vec.size()); //vector size check
		System.out.println("-----------------------");
		
		obj="good day";
		vec.addElement(obj);
		System.out.println(vec.capacity()); // vector�뷮 check
		System.out.println(vec.size()); //vector size check
		
	}
}
