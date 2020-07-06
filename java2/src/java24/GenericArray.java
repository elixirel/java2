 package java24;

class MyArray2<T>{
	int size;
	MyArray2() {
		size=10;
	}
	MyArray2(int size) {
		this.size=size;
	}
	
	private Object[] array=new Object[size];
	int i;
	public void add(T obj) {
		array[i++]=obj;
	}
	
	
	public T get(int index) {
		return (T)array[index];
	}
}
public class GenericArray {
	public static void main(String[] args) {
		MyArray2<String> myArray1=new MyArray2<String>();
		myArray1.add(new String("test"));
		String str=myArray1.get(0);
		System.out.println(str);
		
		MyArray2<Integer> myArray2=new MyArray2<Integer>();
		myArray2.add(new Integer(100));
		int num=myArray2.get(0);
		System.out.println(num);
		
		
	}
}
