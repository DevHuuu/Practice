package chap3.operator.binaryoperator;
/*
 * 복합 대입 연산자
 * A += B : A = A + B  
 * A -= B : A = A - B
 * A *= B : A = A * B
 * A /= B : A = A / B
 * A %= B : A = A % B
 */
public class AssignmentOpertorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *= 3;
		System.out.println("result=" + result);
		result /= 5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
	}
}
