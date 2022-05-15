package chap3.operator.binaryoperator;
/*
 * 비트 이동 연산자
 * a << b : 정수 a의 각 비트를 왼쪽으로 b만큼 이동(이동 후 빈 자리는 0으로 채워짐)
 * a >> b : 정수 a의 각 비트를 오른쪽으로 b만큼 이동 (이동 후 빈 자리는 정수 a의 MSB(최상위 부호 비트)와 같은 값으로 채워진다.)
 * 													  a의 MSB = a가 양수면 0, 음수면 1
 * a >>> b : 정수 a의 각 비트를 오른쪽으로 b만큼 이동(이동 후 빈 자리는 0으로 채워짐)
 */
public class BitShiftExample {
	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >>> 3 = " + (-8>>>3));
	}
}
