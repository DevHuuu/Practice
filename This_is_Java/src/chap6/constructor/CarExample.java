package chap6.constructor;

//생성자를 호출해서 객체 생성
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		//Car myCar = new Car();	//명시적으로 선언한 생성자가 존재할 경우 컴파일러는 기본생성자를 추가하지 않는다.
	}
}
