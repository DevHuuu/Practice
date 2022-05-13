package chap3.operator.binaryoperator;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		String UserInput = "NaN";
		double	val = Double.valueOf(UserInput);	//입력값을 double타입으로 변경하는 메서드
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
