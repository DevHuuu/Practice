package chap3.operator.binaryoperator;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");	// tyr{}구문에서 발생한 예외를 처리하는 코드
		}
	}

	public static int safeAdd(int left, int right) {
		if(right>0) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");	//예외를 발생시키는 코드
			}
		}else {
			if(left<Integer.MIN_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");	//예외를 발생시키는 코드
			}
		}
		return left + right;
	}
}
