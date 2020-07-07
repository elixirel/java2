package java26.hashset;

import java.util.*;
import java26.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet=new MemberHashSet();
		
//		Member memberLee=new Member(1003,"������");
//		Member memberSon=new Member(1001,"�ո���");
//		Member memberPark=new Member(1002,"�ڼ���");
		
		
		memberHashSet.addMember(new Member(1003,"������"));
		memberHashSet.addMember(new Member(1001,"�ո���"));
		memberHashSet.addMember(new Member(1002,"�ڼ���"));
		memberHashSet.showAllMember();
		
		Member memberHong=new Member(1003,"ȫ�浿");
		
		memberHashSet.addMember(memberHong); // id 1003�� �ߺ��̶� �Էµ��� ���ϰ� false ��ȯ
		memberHashSet.showAllMember();
		
	}
}
// HashSet�� equals�� hashCode�� �������Ͽ� �������� �ߺ����θ� �Ǵ�
// String, Integer ���� �̹� JDK���� �����ǵǾ��ְ� JVM���� �����ϹǷ� �ߺ��� ����
// ������ comparable�� ���Ͽ� ���������־����. (String, Integer���� �̹� �Ǿ�����)