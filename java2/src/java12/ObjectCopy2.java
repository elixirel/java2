package java12;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥","조경래");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("대지","펄 벅");
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		
		//깊은 복사 : 각각의 요소를 직접 가져와서 넣음
		
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
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
