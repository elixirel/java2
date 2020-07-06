package java26.arraylist;

public class Board {
	
	String subject;
	String content;
	String writer;
	public Board(String subject, String Content, String writer) {
		this.subject=subject;
		this.content=Content;
		this.writer=writer;
	}
	
	@Override
	public String toString() {
		return "Subject: "+subject+", content:"+content+", writer:"+writer;
	}
}
