package java26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","임꺽정"));
		messageQueue.offer(new Message("sendKakaotalk","고길동"));
		
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			System.out.print(message.to+"에게 ");
			switch(message.command) {
			
			case "sendMail": System.out.println("매일을 보냅니다."); break;
			case "sendSMS": System.out.println("문자를 보냅니다."); break;
			case "sendKakaotalk": System.out.println("카카오톡을 보냅니다."); break;
			
			
			}
		}
		
	}

}
