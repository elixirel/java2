package java29.staticex;

public class A {
	A() {
		System.out.println("A 积己凳");
	}

	public class B {
		int field1;

		B() {
			System.out.println("B 积己凳");

		}

		void method1() {
		}

	}

	static class C {
		C() {
			System.out.println("C 积己凳");

		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		class D {
			D() {
				System.out.println("D 积己凳");
			}

			int field1;

			void method5() {
			};

		}
		D d = new D();
		d.field1 = 3;
		d.method5();
	}
}
