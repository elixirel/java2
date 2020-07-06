package java26.arraylist;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		
		long startTime=System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		long endTime=System.nanoTime()-startTime;
		System.out.println("Arraylist : "+endTime);
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime()-startTime;
		System.out.println("Linkedlist : "+endTime);
	}
}
