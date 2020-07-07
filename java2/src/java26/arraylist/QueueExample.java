package java26.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","�Ӳ���"));
		messageQueue.offer(new Message("sendKakaotalk","��浿"));
		
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			System.out.print(message.to+"���� ");
			switch(message.command) {
			
			case "sendMail": System.out.println("������ �����ϴ�."); break;
			case "sendSMS": System.out.println("���ڸ� �����ϴ�."); break;
			case "sendKakaotalk": System.out.println("īī������ �����ϴ�."); break;
			
			
			}
		}
		
	}

}
