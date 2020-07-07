package java25.hashmap;
import java26.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap=new MemberHashMap();
		
		Member memberLee=new Member(1004,"ÀÌÁö¿ø");
		Member memberSon=new Member(1002,"¼Õ¹Î±¹");
		Member memberPark=new Member(1003,"¹Ú¼­Èû");
		Member memberHong=new Member(1001,"È«±æµ¿");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		System.out.println("-------------------------");
		memberHashMap.removeMember(1002);
		memberHashMap.removeMember(1001);
		
		memberHashMap.showAllMember();
		
	}
}
