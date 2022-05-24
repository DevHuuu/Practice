package chap5.referencevar;
/*
 * 기본타입 변수의 ==, != 연산자는 변수의 값이 같은지 다른지를 비교하지만,
 * 참조타입 변수에서는 변수가 같은 객체를 참조하는지에 대한 여부를 나타낸다.
 * 때문에 new연산자를 통해 새로운 객체를 생성한 경우 서로 다른 객체를 가르키기 때문에 
 * 문자열이 같은지의 여부를 알아보고 싶을 때는 equals()메서드를 이용한다.
 */
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} 
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar1.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} 
	}
}
