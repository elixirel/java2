package java25.hashmap;

import java.util.*;

import java26.Member;

public class MemberHashMap {
	private HashMap<Integer,Member> hashMap;
	public MemberHashMap() {
		hashMap=new HashMap<Integer, Member>();
		
	}
	
	public void addMember(Member m) {
		hashMap.put(m.getMemberId(),m);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
				return true;
			} else {
			System.out.println(memberId+"가 존재하지 않습니다.");
			return false;
		}
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hashMap.get(key);
			System.out.println(member);
			
		}
	}
}
