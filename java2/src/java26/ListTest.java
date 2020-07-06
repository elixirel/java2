package java26;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> ls=new ArrayList<>();
		
		
		ls.add("Hi");
		ls.add("baegopa");
		ls.add("jollyo");
		
		for(String s:ls) {
			System.out.println(s);
		}
		System.out.println();
		ls.add(3,"zagosipo");
		
		for(String s:ls) {
			System.out.println(s);
		}
		System.out.println();
		ls.remove(0);
		
		for(String s:ls) {
			System.out.println(s);
		}
	}
}
