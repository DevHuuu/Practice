package chap2.type;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;	//컴파일에러-정수타입의 연산은 int타입으로 출력된다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;	//컴파일에러-정수타입의 연산은 int타입으로 출력된다.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intVlaue5 = 10;
//		int intVlaue6 = 10 / 4.0;	//컴파일에러-연산에 float이 아닌 실수타입이 오면 결과는 double 타입으로 출력된다.
		double doubleValue = intVlaue5 / 4.0;
		System.out.println(doubleValue);
	}
}
