package java26.arraylist;
import java26.Member;
public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberarraylist=new MemberArrayList();
		
		Member memberLee=new Member(1004,"������");
		Member memberSon=new Member(1002,"�չα�");
		Member memberPark=new Member(1003,"�ڼ���");
		Member memberHong=new Member(1001,"ȫ�浿");
		
		memberarraylist.addMember(memberLee);
		memberarraylist.addMember(memberSon);
		memberarraylist.addMember(memberPark);
		memberarraylist.addMember(memberHong);
		
		memberarraylist.showAllMember();
		
		System.out.println("-------------------------");
		memberarraylist.removeMember(memberHong.getMemberId());
		
		memberarraylist.showAllMember();
		
		System.out.println("-------------------------");
		
	}
}
