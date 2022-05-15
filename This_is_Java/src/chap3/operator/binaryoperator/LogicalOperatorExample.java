package chap3.operator.binaryoperator;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		/*
		 * 논리곱(AND)연산자
		 * 두 피연산자가 모두 true인 경우에만 true를 산출하고 하나라도 false라면 false를 산출한다.
		 * && 연산자 : 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않고 false를 산출한다.
		 * & 연산자 : 반드시 앞, 뒤 피연산자를 모두 평가하여 결과를 산출한다.
		 */
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		}

		if( !(charCode<48) && !(charCode>57) ) {	//논리 부정 연산자(!) : 피연산자가 true일 경우 false를
			System.out.println("0~9 숫자 이군요");		//							 false일 경우 true를 산출한다.
		}
		
		/*
		 * 논리합(OR)연산자
		 * 두 피연산자중 하나라도 true라면 true를 산출하고 모두 false인 경우에만 false를 산출한다.
		 * || 연산자 : 앞의 피연산자가 true라면 뒤의 피연산자를 평가하지 않고 true를 산출한다.
		 * | 연산자 : 반드시 앞, 뒤 피연산자를 모두 평가하여 결과를 산출한다.
		 */
		int value = 6;
		
		if( ( value%2 == 0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if( ( value%2 == 0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}
	}
}
