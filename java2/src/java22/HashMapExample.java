package java22;
import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		// object Key as key, save String 
		HashMap<Key, String> hashMap=new HashMap<Key, String>();
		
		//�ĺ�Ű(hashcode) �Է�:put
		hashMap.put(new Key(1), "ȫ�浿");
		hashMap.put(new Key(1), "����Ʈ����");
		hashMap.put(new Key(1),"100");
		hashMap.put(new Key(1), "3.9");
		
		//get value using hashcode key
		String value=hashMap.get(new Key(1));
		
		
	}
}
