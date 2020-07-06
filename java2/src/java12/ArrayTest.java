package java12;
import java.util.*;

public class ArrayTest {
	public static void main(String[] args) {
		//fixed array; 미리 메모리 할당->속도 빠름, 동적으로 변화 불가
		int[] i=new int[] {1,2,3,4,5,6,7,8,9,10};
		//int i[]={1,2,3,4,5,6,7,8,9,10};
		//int i[]=new int[10]; i[0]=1; i[1]=2; ...
		
		double d[]=new double[5];
		
		d[0]=10.0;
		d[1]=20.0;
		d[2]=30.0; // d[3]=0.0, d[4]=0.0
		
		for(double x:d) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		for (int j : i) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("---------------------");
	
		
		//allocated array; 동일한 자료, 동적 할당. size는 capacity로 확인. 추가/삭제가 가능하지만 재할당이 필요하므로
		//수행시간이 느림
		ArrayList<Integer> t=new ArrayList<>();
		
		t.add(10);
		t.add(20);
		t.add(30);
		
		//Vector; same as arraylist but 동기화 지원
		Vector<String> v=new Vector<>();
		
		v.add("new");
		v.add("java");
		v.add("creation");
		
		//각 value의 물리적주소를 할당하여 속도를 상승 (가장 빠름)
		LinkedList<Double> l=new LinkedList<>();
		
		l.add(100.0);
		l.add(400.0);
		l.add(500.0);
		
		//객체배열의 초기값:null, 인수값을 넣어야 heap메모리가 할당되어 인스턴스화 된다.
		
		//Stack -> FiLo(선입후출), Push/Pop으로 입출력
		Stack<Integer> s=new Stack<>();
		
		s.push(5);
		s.push(10);
		s.push(15);
		
		// binary search tree
		//작은수 ------나------ 큰수 (중복x)
		//in-order(오름차순) : 왼-나-오
		//pre-order(  "  ) : 나-왼-오
		//post-order(내림차순):왼-오-나
		
		//to balance the data structure : AVL/RedBlack(JAVA)
		
		
		//data
		//list->arraylist, vector / linkedlist -> 중복가능,순서유지
		
		//set->treeset / hashset ->중복불가/순서상관x
		
		//map->hashtable(동기화) / hashmap / treemap / properties
		
	}
}
