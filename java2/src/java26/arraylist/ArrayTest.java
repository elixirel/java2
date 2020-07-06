package java26.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		int iArray[]= {5,4,3,2,1};
		String sArray[]=new String[5];
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Hi");
		System.out.println(Arrays.toString(sArray));
		
		List<String> city=Arrays.asList("Seoul","Busan","Daegu","Daejeon","Jeju");
		
		for(String s:city) {
			System.out.println(s);
		}
	}
}
