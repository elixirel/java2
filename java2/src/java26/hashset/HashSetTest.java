package java26.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add(new String("홍길동"));
		hashSet.add(new String("고길동"));
		hashSet.add(new String("김길동"));
		hashSet.add(new String("박길동"));
		hashSet.add(new String("고길동"));
		
		boolean b1=hashSet.add("이길동");
		System.out.println(b1);
		
		boolean b2=hashSet.add("이길동");
		System.out.println(b2);
		
		System.out.println(hashSet);
		
	}
}
