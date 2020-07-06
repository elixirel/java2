package java12;
import java.util.*;

public class ArrayTest {
	public static void main(String[] args) {
		//fixed array; �̸� �޸� �Ҵ�->�ӵ� ����, �������� ��ȭ �Ұ�
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
	
		
		//allocated array; ������ �ڷ�, ���� �Ҵ�. size�� capacity�� Ȯ��. �߰�/������ ���������� ���Ҵ��� �ʿ��ϹǷ�
		//����ð��� ����
		ArrayList<Integer> t=new ArrayList<>();
		
		t.add(10);
		t.add(20);
		t.add(30);
		
		//Vector; same as arraylist but ����ȭ ����
		Vector<String> v=new Vector<>();
		
		v.add("new");
		v.add("java");
		v.add("creation");
		
		//�� value�� �������ּҸ� �Ҵ��Ͽ� �ӵ��� ��� (���� ����)
		LinkedList<Double> l=new LinkedList<>();
		
		l.add(100.0);
		l.add(400.0);
		l.add(500.0);
		
		//��ü�迭�� �ʱⰪ:null, �μ����� �־�� heap�޸𸮰� �Ҵ�Ǿ� �ν��Ͻ�ȭ �ȴ�.
		
		//Stack -> FiLo(��������), Push/Pop���� �����
		Stack<Integer> s=new Stack<>();
		
		s.push(5);
		s.push(10);
		s.push(15);
		
		// binary search tree
		//������ ------��------ ū�� (�ߺ�x)
		//in-order(��������) : ��-��-��
		//pre-order(  "  ) : ��-��-��
		//post-order(��������):��-��-��
		
		//to balance the data structure : AVL/RedBlack(JAVA)
		
		
		//data
		//list->arraylist, vector / linkedlist -> �ߺ�����,��������
		
		//set->treeset / hashset ->�ߺ��Ұ�/�������x
		
		//map->hashtable(����ȭ) / hashmap / treemap / properties
		
	}
}
