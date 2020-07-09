package java30.reudce;

import java.util.*;

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = { "�ȳ��ϼ���~~", "hello", "good morning", "�ݰ����ϴ�~^~" };
		// reduce(�ʱⰪ,�Ű�����->�����);
		String longest=Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else
				return s2;
		});
		//���
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else
				return s2;
		}));
		

		//BinaryOperator�� ������ Ŭ�����̿�
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
		
	}
	
	
}
