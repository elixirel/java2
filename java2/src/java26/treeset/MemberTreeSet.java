package java26.treeset;

import java.util.*;
import java26.Member;

public class MemberTreeSet {
	// field ����
	private TreeSet<Member> treeSet;

	// ������ ��ü ����
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}

	//hashSet�� ��ü �߰�
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir=treeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempid=member.getMemberId();
			if(tempid==memberID) {          // member ������ �Ű������� ��ġ�ϸ�
				treeSet.remove(member); // �ش����� �����ϰ�
				return true;                // true ��ȯ
			}
		}
		
		System.out.println("�ش��ϴ� ���� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member m:treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
}
