package java12;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("�¹���","���淡");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("����","�� ��");
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		
		//���� ���� : ������ ��Ҹ� ���� �����ͼ� ����
		
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		bookArray1[0].setBookname("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		System.out.println("-------bookArray1--------");
		
		for(Book b:bookArray1) {
			b.showBookinfo();
		}
		
		System.out.println("-------bookArray2--------");
	
		for(Book b:bookArray2) {
			b.showBookinfo();
			
		}
			
	}
}
