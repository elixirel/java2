package java26.hashset;

import java.util.*;
import java26.Member;

public class MemberHashSet {
	// field ����
	private HashSet<Member> hashSet;

	// ������ ��ü ����
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	//hashSet�� ��ü �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir=hashSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempid=member.getMemberId();
			if(tempid==memberID) {          // member ������ �Ű������� ��ġ�ϸ�
				hashSet.remove(member); // �ش����� �����ϰ�
				return true;                // true ��ȯ
			}
		}
		
		System.out.println("�ش��ϴ� ���� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member m:hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
}
