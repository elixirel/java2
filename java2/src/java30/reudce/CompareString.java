package java30.reudce;

import java.util.*;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length>=s2.getBytes().length) {
			return s1;
		}
		else return s2;
	}
	
}
