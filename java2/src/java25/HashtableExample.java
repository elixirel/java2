package java25;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String,String> map=new Hashtable<>();
		
		map.put("spring","12");
		map.put("summer", "123");
		map.put("fall","1234");
		map.put("winter","12345");
		
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("���̵�:");
			String id=s.nextLine();
			System.out.println("��й�ȣ:");
			String pass=s.nextLine();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pass)) {
					System.out.println("�α��ο� �����߽��ϴ�.");
					break;
				}
				else {
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
				}
			}
			else {
				System.out.println("���� ���̵��Դϴ�.");
			}
			
		}
	}
}
