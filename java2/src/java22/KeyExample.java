package java22;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		
		HashMap<Key, String> hashmap=new HashMap<Key, String>();
		
		hashmap.put(new Key(1), "ȫ�浿");
		
		String str=hashmap.get(new Key(1));
		
		System.out.println(str);
	}
}
