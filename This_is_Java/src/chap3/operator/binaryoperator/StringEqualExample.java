package chap3.operator.binaryoperator;

public class StringEqualExample {
	public static void main(String[] args) {
		String strVar1 = "신용권";
		String strVar2 = "신용권";
		String strVar3 = new String("신용권");	//new를 통해 새로운 객체를 생성
		
		/*
		 *  ==연산자는 저장된 주소를 판별하기 때문에 
		 * 새로운 객체가 생성되어 가르키는 주소가 다른 strVar3는 같지 않다고 본다.
		 */
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		
		/*
		 * equals() 메서드는 원본 문자열와 매개값의 문자열이 동일한지를 판별하기에
		 * 서로 같다고 본다. 
		 */
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
