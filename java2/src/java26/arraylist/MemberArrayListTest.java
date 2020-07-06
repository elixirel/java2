package java26.arraylist;
import java26.Member;
public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberarraylist=new MemberArrayList();
		
		Member memberLee=new Member(1004,"ÀÌÁö¿ø");
		Member memberSon=new Member(1002,"¼Õ¹Î±¹");
		Member memberPark=new Member(1003,"¹Ú¼­Èû");
		Member memberHong=new Member(1001,"È«±æµ¿");
		
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
