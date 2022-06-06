package chap6.sec13.exam02_class_access.package1;

public class B {
	// 필드
	A a1 = new A(true);		
	A a2 = new A(1);		
	//A a3 = new A("문자열");	// private접근제한이기에 다른 클래스에서는 접근불가
}
