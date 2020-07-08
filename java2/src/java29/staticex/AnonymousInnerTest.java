package java29.staticex;

class OutClass3 {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // arguments are final or functionally final
		int num = 100; // local var (final or functionally final)

		// 메소드 내부 클래스
		return new Runnable() {

			int localnum = 10;

			@Override
			public void run() {

				System.out.println("localNum:" + localnum);
				System.out.println("outnum:" + outNum);
				System.out.println("outSTATICnum:" + sNum);

			}
		};

	}
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass3 out = new OutClass3();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
