package chap7.abstract_class;

//실행 클래스
public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();	//추상클래스는 new를 통한 객체 생성을 할 수 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();			//추상클래스의 메소드
		smartPhone.internetSearch();		//실체 클래스의 메소드
		smartPhone.turnOff();			//추상클래스의 메소드
	
	
	}
}
