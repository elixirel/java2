package java29.staticex;

public class A {
	A() {
		System.out.println("A ������");
	}

	public class B {
		int field1;

		B() {
			System.out.println("B ������");

		}

		void method1() {
		}

	}

	static class C {
		C() {
			System.out.println("C ������");

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
				System.out.println("D ������");
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
