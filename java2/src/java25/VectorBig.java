package java25;

import java.util.Scanner;
import java.util.Vector;

//-1이 입력될때까지 vector에 int 저장하고  최대값을 출력
public class VectorBig {
	public static void printBig(Vector<Integer> v) {
		int big=v.get(0);
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i)>big) big=v.get(i);
		}
		System.out.println(big);
	}
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.print("Int형 자료를 입력하세요(-1 입력시 종료):");
			int input=s.nextInt();
			if(input==-1) break;
			v.add(input);
			
		}
		if(v.size()==0) System.out.println("입력받은 자료가 없습니다.");
		else printBig(v);
		
	}

}
