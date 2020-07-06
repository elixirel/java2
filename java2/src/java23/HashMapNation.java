package java23;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		System.out.println("나라이름과 인구를 입력하시오");
		System.out.println("예: Korea 5000");
		Scanner s=new Scanner(System.in);
		//input
		while(true) {
			String nat=s.next();
			if(nat.equals("그만")) break;
			int pop=s.nextInt();
			nations.put(nat, pop);
			
			
			
		}
		//search
		while(true) {
			System.out.print("인구검색 : ");
			
			String nat = s.next();
			System.out.println();
			if(nat.equals("그만")) break;
			if(nations.containsKey(nat)) {
				int pop=nations.get(nat);
				System.out.println(nat+"의 인구는"+pop);
			}
			else	
				System.out.println("그런 나라는 없습니다.");
			
		}
		s.close();
	}
}
