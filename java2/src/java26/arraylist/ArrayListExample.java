package java26.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("DATABASE");
		list.add("spring");
		
		
		
		//listÀÇ ÃÑ°´Ã¼¼ö
		System.out.println(list.size());
		
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("------------------");
		list.remove("DATABASE");
		list.remove(3);
		System.out.println(list.size());
		
		for(String s:list) {
			System.out.println(s);
		}
		
		
	}
}
