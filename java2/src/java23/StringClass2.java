package java23;

public class StringClass2 {
	public static void main(String[] args) {
		String str1=new String("java");
		String str2=new String("python");
		StringBuilder buffer=new StringBuilder(str1);
		
		
		
		System.out.println("ó�� ���ڿ� �ּҰ�"+System.identityHashCode(buffer));
		
		buffer.append("python");
		
		System.out.println("���� ���ڿ� �ּҰ�"+System.identityHashCode(buffer));
		
		str1=buffer.toString();
		
		
		
	}
}
