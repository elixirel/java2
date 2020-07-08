package java30.stream;

import java.util.*;
import java.util.stream.*;


public class ArrayStream {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Arrays.stream(arr).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println(Arrays.stream(arr).sum());
		System.out.println();
		
		System.out.println(Arrays.stream(arr).average());
		System.out.println();
		
		IntStream str=Arrays.stream(arr);
		
		System.out.println(str.sum());
		
		
	}
}
