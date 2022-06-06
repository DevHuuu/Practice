package chap6.sec13.exam02_class_access.package2;

import chap6.sec13.exam02_class_access.package1.A;

public class C {
	// 필드
	A a1 = new A(true);
	//A a2 = new A(1);			// default 접근제한이기에 다른 패키지에서 접근 불가
	//A a3 = new A("문자열");		// private 접근제한이기에 다른 클래스에서는 접근불가
}
