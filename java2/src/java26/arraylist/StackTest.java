package java26.arraylist;

import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
		Stack<Object> st=new Stack<>();
		
		if(st.empty() ) {
			for(int i=0;i<3;i++) {
				st.push(new String("Hi")+i);
				System.out.println("�Է�"+i+"��°:"+st.peek());
			}
		}
		
		st.pop();
		System.out.println("���� Top�� ��ġ: "+st.peek()); // stack underflow/overflow�� ����!!

		st.pop();
		System.out.println("���� Top�� ��ġ: "+st.peek()); // stack underflow/overflow�� ����!!
		
		st.push(new String("everybody"));
		System.out.println(st.peek());
		
		st.push(new String("Jollyo"));
		System.out.println(st.peek());
	}

}
