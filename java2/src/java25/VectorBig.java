package java25;

import java.util.Scanner;
import java.util.Vector;

//-1�� �Էµɶ����� vector�� int �����ϰ�  �ִ밪�� ���
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
			System.out.print("Int�� �ڷḦ �Է��ϼ���(-1 �Է½� ����):");
			int input=s.nextInt();
			if(input==-1) break;
			v.add(input);
			
		}
		if(v.size()==0) System.out.println("�Է¹��� �ڷᰡ �����ϴ�.");
		else printBig(v);
		
	}

}
