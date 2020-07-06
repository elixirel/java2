package java26;
import java.util.Comparator;


public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return (this.memberId - o.memberId); // 오름차순
	}

	public Member(int id, String name) {
		memberId=id;
		memberName=name;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ID: "+memberId+", name: "+memberName+"]\n";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member m=(Member)obj;
			if(memberId==m.memberId)
				return true;
			
		}
		return false;
	};
	
}
