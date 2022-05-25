package chap5.referencevar;
/*
 * java 프로그램을 실행하면 JVM은 길이가 0인 String배열을 생성하여 main()메서드의 매개값으로 전달한다.
 * 	=> String[] args = { };
 * 
 * 커맨드 라인에서 Program Argument에 String배열의 값을 입력하면 args배열을 연산에 이용할 수 있다.
 */
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) {	//입력된 데이터가 2개가 아닐 경우
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);		//프로그램 강제종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
	}
}
