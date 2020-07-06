package java22;

public class Member {
	public String id;

	Member(String id) {
		this.id=id;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member)
		{
			Member compareKey=(Member) obj;
			if(id.equals(compareKey.id)) return true;
			
		}
		return false;
	}
	
	
}
