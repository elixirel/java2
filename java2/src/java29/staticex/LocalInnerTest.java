package java29.staticex;

class OutClass2 {
	int outNum=100;
	static int sNum=200;
	
	Runnable getRunnable(int i) { // arguments are final or functionally final
		int num=100; // local var (final or functionally final)
		
		//메소드 내부 클래스
		
		class MyRunnable implements Runnable {
			
			int localnum=10;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("localNum:"+localnum);
				System.out.println("outnum:"+outNum);
				System.out.println("outSTATICnum:"+sNum);
				
			}
			
		}
		return new MyRunnable();
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass2 out=new OutClass2();
		Runnable runner=out.getRunnable(10);
		runner.run();
	}

}
