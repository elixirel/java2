package java30;

import java.util.*;
import java.util.stream.Stream;
public class ArrayListStream {
	public static void main(String[] args) {
		List<String> sList=new ArrayList<>();
		sList.add("ȫ�浿");
		sList.add("��浿������");
		sList.add("��浿��");
		
		//stream ����
		Stream<String> str=sList.stream();
		
		//���ٽ� ���:stream�� �����Ͽ� �ϳ��� element�� ������ ���
		str.forEach(s->System.out.println(s+" "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s+" "));
		System.out.println();
		
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s+" "));
		System.out.println();
		
		sList.stream().map(s->s.length()).forEach(s->System.out.println(s+" "));
		System.out.println();
		
		
		
		for(String s:sList) {
			System.out.println(s);
		}
		
	}
}
