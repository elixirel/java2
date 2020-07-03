package java22;
import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		// object Key as key, save String 
		HashMap<Key, String> hashMap=new HashMap<Key, String>();
		
		//식별키(hashcode) 입력:put
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(1), "소프트웨어");
		hashMap.put(new Key(1),"100");
		hashMap.put(new Key(1), "3.9");
		
		//get value using hashcode key
		String value=hashMap.get(new Key(1));
		
		
	}
}
