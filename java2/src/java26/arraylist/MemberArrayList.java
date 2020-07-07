package java26.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import java26.Member;
public class MemberArrayList {

	public ArrayList<Member> arrayList;
	
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();
	}
	
	public void addMember(Member memberID) {
		arrayList.add(memberID);
	}
	
	public boolean removeMember(int memberID) {
//		for(int i=0;i<arrayList.size();i++) {
//			Member member=arrayList.get(i);
//			int tempId=member.getMemberId();
//			if(tempId==memberID) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
//		
		Iterator<Member> ir=arrayList.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempid=member.getMemberId();
			if(tempid==memberID) {          // member 변수가 매개변수와 일치하면
				arrayList.remove(memberID); // 해당멤버를 삭제하고
				return true;                // true 반환
			}
		}
		
		System.out.println("해당하는 값이 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member m:arrayList) {
			System.out.println(m);
		}
		
	}
	

}
