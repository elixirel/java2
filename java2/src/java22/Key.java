package java22;



public class Key {
	public int number;
	Key(int number) {
		this.number=number;
	
		

	}
	
	@Override
	public int hashCode() {
		return number;
	
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			//다운캐스팅으로 obj가 Key클래스의 compareKey로 대입
			Key compareKey=(Key) obj;
			
			
			//this의 number와 compareKey의 number값이 같으면 true 아니면 false
			if(number==compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
}
