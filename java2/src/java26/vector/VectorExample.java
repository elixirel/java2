package java26.vector;

import java.util.List;
import java.util.Vector;
import java26.arraylist.Board;


public class VectorExample {
	public static void main(String[] args) {
		List<Board> list=new Vector<>();
		
		list.add(new Board("subject1","content1","writer1"));
		list.add(new Board("subject2","content2","writer2"));
		list.add(new Board("subject3","content3","writer3"));
		list.add(new Board("subject4","content4","writer4"));
		list.add(new Board("subject5","content5","writer5"));
		
		
		for(Board b:list) {
			System.out.println(b);
		}
		System.out.println("-----------------------------");
		
		list.remove(2);
		list.remove(3);
		
		for(Board b:list) {
			System.out.println(b);
		}

		
	}
}
