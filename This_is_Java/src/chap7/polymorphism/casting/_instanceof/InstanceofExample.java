package chap7.polymorphism.casting._instanceof;

//객체 타입 확인
public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();	//child 객체를 참조
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();	//parent 객체를 참조
		method1(parentB);
		method2(parentB);	//예외 발생
	}
}
