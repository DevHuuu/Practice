package chap3.operator.ternaryoperator;
/*
 * 삼항 연산자
 * (조건식)? A : B
 * - 조건식이 true일 경우 A가 실행되고 false일 경우 B가 실행 된다.
 */
public class ConditionalOperatorExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
/*					//score > 90 -true-> grade = 'A'
 * 								 ㄴfalse-> score > 80 -true-> grade = 'B'
 * 													  ㄴfalse-> grade = 'C'
 */													 
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
