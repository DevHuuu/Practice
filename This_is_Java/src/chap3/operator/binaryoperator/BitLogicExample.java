package chap3.operator.binaryoperator;
/*
 * 비트 논리 연산자
 * 논리곱(&)연산자 : 두 비트 모두 1일 경우에만 1이 산출 
 * 논리합(|)연산자 : 두 비트 모두 0일 경우에만 0이 산출
 * 배타적 논리합(^)연산자 : 두 비트가 서로 다른 값 (0,1)이면 1을, 같은 값(0,0), (1,1)이면 0을 산출
 * 논리 부정(~)연산자 : 피연산자가 1이면 0을, 0이면 1을 산출
 */
public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
	}	
}
