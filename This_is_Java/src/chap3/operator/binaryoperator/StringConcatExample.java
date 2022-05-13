package chap3.operator.binaryoperator;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; 		//문자열 + 숫자
		String str2 = str1 + " 특징";		//문자열 + 문자열
		System.out.println(str2);
		
		/*
		 * 산술연산자는 왼쪽->오른쪽 으로 연산이 진행된다.
		 */
		String str3 = "JDK" + 3 + 3.0;	// (문자열 + 숫자) + 숫자
		String str4 = 3 + 3.0 + "JDK";  // (숫자 + 숫자) + 문자열
		System.out.println(str3);
		System.out.println(str4);
	}
}
