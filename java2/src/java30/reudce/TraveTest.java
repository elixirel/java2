package java30.reudce;

import java.util.*;

public class TraveTest {

	public static void main(String[] args) {
		TravelCustomer custKim=new TravelCustomer("��浿",30,30000);
		TravelCustomer custLee=new TravelCustomer("�̼���",10,30000);
		TravelCustomer custHong=new TravelCustomer("ȫ�浿",35,60000);
		
		List<TravelCustomer> customer=new ArrayList<>(); 
		customer.add(custKim);
		customer.add(custLee);
		customer.add(custHong);
		
		System.out.println("====�����====");
		customer.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("====�ѿ�����====");
		int totalprice=customer.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(totalprice);
		
		System.out.println("====20���̻�����(����)====");
		customer.stream().filter(s->s.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
