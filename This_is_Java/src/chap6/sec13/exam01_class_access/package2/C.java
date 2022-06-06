package chap6.sec13.exam01_class_access.package2;

import chap6.sec13.exam01_class_access.package1.*;

public class C {
	//A a;	// 패키지가 다르기에 default로 접근제한이 된 A클래스는 접근불가 -> 컴파일 에러
	B b;	// public으로 선언된 클래스 B는 다른 패키지에서도 접근이 가능
}
