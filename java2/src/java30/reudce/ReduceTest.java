package java30.reudce;

import java.util.*;

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = { "안녕하세요~~", "hello", "good morning", "반갑습니다~^~" };
		// reduce(초기값,매개변수->실행부);
		String longest=Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else
				return s2;
		});
		//출력
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else
				return s2;
		}));
		

		//BinaryOperator를 구현한 클래스이용
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
		
	}
	
	
}
