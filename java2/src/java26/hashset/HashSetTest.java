package java26.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add(new String("ȫ�浿"));
		hashSet.add(new String("��浿"));
		hashSet.add(new String("��浿"));
		hashSet.add(new String("�ڱ浿"));
		hashSet.add(new String("��浿"));
		
		boolean b1=hashSet.add("�̱浿");
		System.out.println(b1);
		
		boolean b2=hashSet.add("�̱浿");
		System.out.println(b2);
		
		System.out.println(hashSet);
		
	}
}
