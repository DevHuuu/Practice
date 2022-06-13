package chap7.method_overrideing;

//부모클래스	
public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 캑체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
