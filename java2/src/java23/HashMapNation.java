package java23;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		System.out.println("�����̸��� �α��� �Է��Ͻÿ�");
		System.out.println("��: Korea 5000");
		Scanner s=new Scanner(System.in);
		//input
		while(true) {
			String nat=s.next();
			if(nat.equals("�׸�")) break;
			int pop=s.nextInt();
			nations.put(nat, pop);
			
			
			
		}
		//search
		while(true) {
			System.out.print("�α��˻� : ");
			
			String nat = s.next();
			System.out.println();
			if(nat.equals("�׸�")) break;
			if(nations.containsKey(nat)) {
				int pop=nations.get(nat);
				System.out.println(nat+"�� �α���"+pop);
			}
			else	
				System.out.println("�׷� ����� �����ϴ�.");
			
		}
		s.close();
	}
}
