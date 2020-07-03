package java22;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1=System.nanoTime();
		
		int sum=0;
		for(int i=0; i<100000000; i++)
			sum+=i;
		long time2=System.nanoTime();
		
		System.out.println(time2-time1);
	}
}
