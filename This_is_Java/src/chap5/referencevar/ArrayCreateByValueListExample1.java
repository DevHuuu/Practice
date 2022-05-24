package chap5.referencevar;
/*
 *   배열 선언
 * - int[] arr = new int[길이];
 * 
 *   배열 초기화
 * - int[] numbers = new int[] {10, 20, 30};  
 * - int[] numbers = {10, 20, 30};   -- new int[] 생략 가능
 * 
 *   배열 선언 후 초기화
 * - int[] ids;
     ids = new int[] {10, 20, 30};  -- 선언 후 초기화는 초기값 입력시 반드시 new int[] 붙일 것!!
 */
public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		
		System.out.println("scores[0] : " + scores[0]); //배열의 순서를 나타내는 인덱스는 0부터 시작한다.
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
