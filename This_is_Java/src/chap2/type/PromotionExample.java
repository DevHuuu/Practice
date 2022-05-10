package chap2.type;
/*
 * 메모리가 작은 타입을 큰타입으로 변환할 때 또는 정수타입에서 실수타입에 대입할 때 자동 타입 변환(Promotion)이 일어난다.
 * 자동 타입 변환 순서
 * byte -> short -> int -> long -> float ->double
 */
public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;		//int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;			//int <- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;		//long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//double <- int
		System.out.println(doubleValue);
	}
}
