package chap7.protected_.package2;

import chap7.protected_.package1.A;

//protected 접근 제한자
public class D extends A {
	public D() {
		super();					//O
		this.field = "value";		//O
		this.method();				//O
	}
	
}
