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
				System.out.println("입력"+i+"번째:"+st.peek());
			}
		}
		
		st.pop();
		System.out.println("현재 Top의 위치: "+st.peek()); // stack underflow/overflow에 주의!!

		st.pop();
		System.out.println("현재 Top의 위치: "+st.peek()); // stack underflow/overflow에 주의!!
		
		st.push(new String("everybody"));
		System.out.println(st.peek());
		
		st.push(new String("Jollyo"));
		System.out.println(st.peek());
	}

}
