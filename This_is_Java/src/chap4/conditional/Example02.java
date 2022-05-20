package chap4.conditional;
/*
 * num이라는 변수에 120이라는 숫자를 초기화 한 후에 이 숫자가 양수이면서 짝수인지
 * 확인하는 프로그램을 만드시오
 */
public class Example02 {
	public static void main(String[] args) {
		int num = 120;
		if((num > 0) && (num%2)==0) {
			System.out.println(num + "은 양수이면서 짝수입니다.");
		}
	}
}
