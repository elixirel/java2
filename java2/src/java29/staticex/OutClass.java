package java29.staticex;

public class OutClass {
	private int num=10;
	private static int sNum=20;
	private InClass inClass;
	
	public OutClass() {
		inClass=new InClass();
	}
	
	class InClass {
		int inNum=100;
//		static int sinNum=2000; //InClass isn't static
//		static int sNum=50;     //so you cant change or create a static field
//		static void sTest() {}  //and/or static method.		
		void inTest() {
			System.out.println(num);
			System.out.println(inNum);
			System.out.println(sNum);
		}
	}
	static class InStaticClass {
		int inNum=200;
		static int sinNum=500;
		static int sNum=700;
		void inTest() {
//			num=1; // OutClass instance
			System.out.println(inNum);
			System.out.println(sinNum);
			System.out.println(sNum);
		}
		static void sTest() {

			System.out.println(sinNum);
			System.out.println(sNum);
		}
	}
	public static void main(String[] args) {
		//outside class
		OutClass outClass=new OutClass();
		System.out.println();
		
		///inside class using outside class
		
		OutClass.InClass inClass=outClass.new InClass();
		System.out.println("�ܺ�Ŭ���� ������ �̿��Ͽ� ����Ŭ���� ����");
		inClass.inTest();
		System.out.println();
		
		//inside class without outside class
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		
		//call from object
		sInClass.sTest();
		
		//call from class
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��2");
		OutClass.InStaticClass.sTest();
	}
}
