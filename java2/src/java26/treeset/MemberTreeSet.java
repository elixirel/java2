package java26.treeset;

import java.util.*;
import java26.Member;

public class MemberTreeSet {
	// field 생성
	private TreeSet<Member> treeSet;

	// 생성자 객체 생성
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}

	//hashSet에 객체 추가
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir=treeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempid=member.getMemberId();
			if(tempid==memberID) {          // member 변수가 매개변수와 일치하면
				treeSet.remove(member); // 해당멤버를 삭제하고
				return true;                // true 반환
			}
		}
		
		System.out.println("해당하는 값이 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member m:treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
}
