package java12;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥","조경래");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("대지","펄 벅");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(Book b:bookArray2) {
			b.showBookinfo();
		}
		//얕은 복사
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
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
