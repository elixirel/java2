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
			if(tempid==memberID) {          // member ������ �Ű������� ��ġ�ϸ�
				arrayList.remove(memberID); // �ش����� �����ϰ�
				return true;                // true ��ȯ
			}
		}
		
		System.out.println("�ش��ϴ� ���� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member m:arrayList) {
			System.out.println(m);
		}
		
	}
	

}
