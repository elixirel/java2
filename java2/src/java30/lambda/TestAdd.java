package java30.lambda;

public class TestAdd {
	public static void main(String[] args) {
		Add addF=(x,y)->x+y; //구현부, 인터페이스의 인자의 형태(int x, int y)만 보고 가져옴
		                     // 같은 형태의 인자를 갖는 메소드가 둘 이상일경우 작동 불가

		System.out.println(addF.add(3,5));
		
							//is equlivalent to:
		
		Add addA=new Add() {

			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
			
		};
	}
}
