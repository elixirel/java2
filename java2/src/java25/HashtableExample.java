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
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디:");
			String id=s.nextLine();
			System.out.println("비밀번호:");
			String pass=s.nextLine();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pass)) {
					System.out.println("로그인에 성공했습니다.");
					break;
				}
				else {
					System.out.println("비밀번호가 다릅니다.");
				}
			}
			else {
				System.out.println("없는 아이디입니다.");
			}
			
		}
	}
}
