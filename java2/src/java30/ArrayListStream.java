package java30;

import java.util.*;
import java.util.stream.Stream;
public class ArrayListStream {
	public static void main(String[] args) {
		List<String> sList=new ArrayList<>();
		sList.add("홍길동");
		sList.add("고길동이지롱");
		sList.add("김길동임");
		
		//stream 생성
		Stream<String> str=sList.stream();
		
		//람다식 사용:stream을 적용하여 하나의 element가 들어오면 출력
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
