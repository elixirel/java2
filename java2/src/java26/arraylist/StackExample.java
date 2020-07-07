package java26.arraylist;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(100));
		
//		for(Coin c:coinBox) {
//			System.out.println(c.getValue());
//		}
		
		while(!coinBox.isEmpty()) {
			System.out.println(coinBox.pop().getValue());
		}
	}

}
