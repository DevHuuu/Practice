package chap3.operator.binaryoperator;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);	//true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);	//false- 부동소수점 타입은 0.1을 근사치로 표현하기 때문
		System.out.println((float)v4 == v5);	//true
		System.out.println(v4 == (double)v5);	//false
		System.out.println((int)(v4*10) == (int)(v5*10));	//true
		
	}
}
