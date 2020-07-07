package java26.treeset;

import java.util.*;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add(new String("홍길동"));
		treeSet.add(new String("고길동"));
		treeSet.add(new String("김길동"));
		treeSet.add(new String("박길동"));
		treeSet.add(new String("고길동"));
		
		boolean b1=treeSet.add("이길동");
		System.out.println(b1);
		
		boolean b2=treeSet.add("이길동");
		System.out.println(b2);
		
		System.out.println(treeSet);
		
	}
}