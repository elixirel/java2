package java30.reudce;

import java.util.*;

public class TraveTest {

	public static void main(String[] args) {
		TravelCustomer custKim=new TravelCustomer("김길동",30,30000);
		TravelCustomer custLee=new TravelCustomer("이순신",10,30000);
		TravelCustomer custHong=new TravelCustomer("홍길동",35,60000);
		
		List<TravelCustomer> customer=new ArrayList<>(); 
		customer.add(custKim);
		customer.add(custLee);
		customer.add(custHong);
		
		System.out.println("====고객명단====");
		customer.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("====총여행비용====");
		int totalprice=customer.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(totalprice);
		
		System.out.println("====20세이상고객명단(정렬)====");
		customer.stream().filter(s->s.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
