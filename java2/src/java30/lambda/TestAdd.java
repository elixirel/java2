package java30.lambda;

public class TestAdd {
	public static void main(String[] args) {
		Add addF=(x,y)->x+y; //������, �������̽��� ������ ����(int x, int y)�� ���� ������
		                     // ���� ������ ���ڸ� ���� �޼ҵ尡 �� �̻��ϰ�� �۵� �Ұ�

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
