package java26.hashset;

import java.util.*;
import java26.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet=new MemberHashSet();
		
//		Member memberLee=new Member(1003,"이지원");
//		Member memberSon=new Member(1001,"손만국");
//		Member memberPark=new Member(1002,"박서훤");
		
		
		memberHashSet.addMember(new Member(1003,"이지원"));
		memberHashSet.addMember(new Member(1001,"손만국"));
		memberHashSet.addMember(new Member(1002,"박서훤"));
		memberHashSet.showAllMember();
		
		Member memberHong=new Member(1003,"홍길동");
		
		memberHashSet.addMember(memberHong); // id 1003이 중복이라 입력되지 못하고 false 반환
		memberHashSet.showAllMember();
		
	}
}
// HashSet의 equals와 hashCode를 재정의하여 데이터의 중복여부를 판단
// String, Integer 등은 이미 JDK에서 재정의되어있고 JVM에서 인지하므로 중복이 불허
// 정렬은 comparable를 통하여 재정의해주어야함. (String, Integer등은 이미 되어있음)