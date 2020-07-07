package java26;



public class Member{
	private int memberId;
	private String memberName;
	
	
//	@Override
//	public int compareTo(Member o) {
//		return 0;
		// TODO Auto-generated method stub
//		return (this.memberId - o.memberId); //오름차순
//		return (this.memberId - o.memberId)*(-1); //내림차순
//		return (this.memberName.compareTo(o.memberName)); // 이름으로 오름차순
//		return (this.memberName.compareTo(o.memberName))*(-1); // 이름으로 내림차순	
//	}
	
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
	}




	
}
