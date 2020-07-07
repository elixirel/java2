package java26.treeset;

import java.util.*;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return ((s1.compareTo(s2))*-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}
}
