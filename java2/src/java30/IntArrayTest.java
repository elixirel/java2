package java30;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		int sum=Arrays.stream(arr).sum();
		
		//��üȭ �ؼ� ���
		IntStream stream=Arrays.stream(arr);
		
		int x=stream.sum();
		
		System.out.println(sum);
	}

}
