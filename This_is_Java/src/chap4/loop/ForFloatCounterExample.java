package chap4.loop;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		/*
		 * 루프의 카운트 변수를 선언할 때 부동소수점타입은 
		 * 실제로 정확한 값을 나타낼 수 없기에사용하지 말아야 한다.
		 */
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}
