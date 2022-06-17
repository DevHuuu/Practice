package chap7.polymorphism.casting;

//강제 타입 변환(캐스팅)
public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2"; //컴파일 오류 
		parent.method3(); //컴파일 오류
		*/
		
		Child child = (Child) parent;	//강제 타입 변환(캐스팅)
		child.field2 = "yyy";	
		child.method3();
	}
}
