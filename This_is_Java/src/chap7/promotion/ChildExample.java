package chap7.promotion;

//자동 타입 변환 후의 멤버 접근
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;		//자동 타입 변환
		parent.method1();			//부모클래스의 메소드 호출
		parent.method2();			//자식클래스의 오버라이드된 메소드 호출
		//parent.method3();			//자동 타입 변환후 자식클래스에만 존재하는 메소드 호출 불가능
	}
}
