package chap3.operator.binaryoperator;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String UserInput = "NaN";
		double	val = Double.valueOf(UserInput);	//입력값을 double타입으로 변경하는 메서드
		
		double currentBalance = 10000.0;	
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
