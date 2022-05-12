package chap3.operator.unaryoperator;

public class OverflowExample {
	public static void main(String[] args) {
		int x1 = 1000000;
		int y1 = 1000000;
		int z1 = x1 * y1;		// 산술연산의 결과값이 int타입의 데이터크기를 벗어나기에 쓰레기값이 산출된다.
		System.out.println(z1);
		
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;		
		System.out.println(z2);
	}
}
