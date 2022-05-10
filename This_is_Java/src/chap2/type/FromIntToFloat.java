package chap2.type;
/*
 * 정수 -> 실수 변환 시 정밀도 손실이 일어나는 경우
 */
public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
