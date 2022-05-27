package chap5.referencevar;

public class EnumExample {
	public static void main(String[] args) {
		
		/* 열거 타입 선언
		 * 열거타입 변수; */
		Week today;
		Week yesterday;
		Week tomorrow;
		
		/*
		 * 열거 상수 저장(초기화)
		 * 열거타입 변수 = 열거타입.열거상수;
		 */
		Week day1 = Week.FRIDAY;
		Week day2 = Week.FRIDAY;
		Week day3 = null;		// 열거 타입또한 열거 객체를 참조하는 참조타입이므로 null값을 저장할 수 있다.
		
		/*
		 * 열거 변수와 열거 상수는 서로 같은 객체를 가리킨다.
		 */
		System.out.println(day1 == Week.FRIDAY);	//true
		System.out.println(day1 == day3); 			//true
		
	}
}
