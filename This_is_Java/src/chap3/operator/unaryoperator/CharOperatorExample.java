package chap3.operator.unaryoperator;

public class CharOperatorExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1;	//컴파일 에러- 산술연산을 할 때 c2는 int형으로 변환이되고 산출도 int타입으로 나오기 때문
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
//		System.out.println("c3:" + c3);
	}
}
