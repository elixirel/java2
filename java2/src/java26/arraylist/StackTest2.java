package java26.arraylist;

import java.util.ArrayList;


class MyStack{
	
	private ArrayList<String> arrayStack=new ArrayList<>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len=arrayStack.size();
		if(len==0) {
			System.out.println("Stack is empty");
			return null;
		}
		return(arrayStack.remove(len-1));
	}
}
public class StackTest2 {
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		
		stack.push("String_Data");
		stack.push("String data");
		stack.push("String#Data");;
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
