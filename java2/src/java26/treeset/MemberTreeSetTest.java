package java26.treeset;

import java.util.*;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add(new String("ȫ�浿"));
		treeSet.add(new String("��浿"));
		treeSet.add(new String("��浿"));
		treeSet.add(new String("�ڱ浿"));
		treeSet.add(new String("��浿"));
		
		boolean b1=treeSet.add("�̱浿");
		System.out.println(b1);
		
		boolean b2=treeSet.add("�̱浿");
		System.out.println(b2);
		
		System.out.println(treeSet);
		
	}
}