package chap9.Restriction.local_class;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;				//final이 명시적으로 붙지 않아도 final의 특징을 지녀 컴파일 에러가 발생
		//localVariable = 100;	
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
