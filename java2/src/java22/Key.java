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
			//�ٿ�ĳ�������� obj�� KeyŬ������ compareKey�� ����
			Key compareKey=(Key) obj;
			
			
			//this�� number�� compareKey�� number���� ������ true �ƴϸ� false
			if(number==compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
}
