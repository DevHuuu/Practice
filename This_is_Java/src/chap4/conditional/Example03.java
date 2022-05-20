package chap4.conditional;
/*
 * num1의 50을 초기화, num2에 100을 초기화 한 후 큰 수에서 작은 수를 빼는 프로그램을 만드시오.
 */
public class Example03 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		if(num1 >= num2) {
			System.out.println("큰 수 : " + num1);
			System.out.println(num1 +" - " + num2 + " = " + (num1-num2));
		}
		else {
			System.out.println("큰 수 : " + num2);
			System.out.println(num2 +" - " + num1 + " = " + (num2-num1));
			
		}
	}
}
