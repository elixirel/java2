package java12;

import javax.swing.JOptionPane;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"ab111","cd222","ef333","gh444","ij555"};
		String res="";
		int i;
		
		for(String s:str) {
			System.out.println(s);
			res=res+s+"\n";
		}
		
		JOptionPane.showMessageDialog(null, "배열의 문자 원소" + res);
	}

}
