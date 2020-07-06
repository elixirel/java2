package java12;

public class Book {
	private String bookname;
	private String author;
	
	public Book() {};
	
	public Book(String book, String aut) {
		bookname=book;
		author=aut;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookinfo() {
		System.out.println("bookname : "+bookname);
		System.out.println("Author : "+author);
	}
}
