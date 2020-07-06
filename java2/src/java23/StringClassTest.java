package java23;

import java.lang.reflect.*;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class strClass=Class.forName("java.lang.String");
		
		Constructor[] cons=strClass.getConstructors();
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		System.out.println();
		Method[] meth=strClass.getMethods();
		for (Method method : meth) {
			System.out.println(method);
		}
		System.out.println();
		Field[] fld=strClass.getFields();
		for (Field field : fld) {
			System.out.println(field);
		}
		System.out.println();

	}

}
