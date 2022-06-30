package chap9.Restriction.member_class;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;		//정적 멤버 클래스 내부에는 정적필드와 정적메소드만 올 수 있다.
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
