package chap7.protected_.package1;

//protected 접근 제한자 테스트
public class B {
	public void method() {
		A a = new A();			//O
		a.field = "value";		//O
		a.method();				//O
	}
}
