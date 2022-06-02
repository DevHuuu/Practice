package chap6.method;

//메소드 오버로딩
public class CalculatorExample3 {
	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		//정사각형의 넓이 구하기
		double result1 = myCal.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCal.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형의 넓이=" + result1);
		System.out.println("직사각형의 넓이=" + result2);
	}
}
