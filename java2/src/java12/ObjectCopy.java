package java12;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("�¹���","���淡");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("����","�� ��");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(Book b:bookArray2) {
			b.showBookinfo();
		}
		//���� ����
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
