package java23;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Have a Nice Day";
		
		StringTokenizer obj=new StringTokenizer(str, " ", false);
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
		
	}

}
