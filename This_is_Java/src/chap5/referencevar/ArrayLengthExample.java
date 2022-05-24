package chap5.referencevar;
/*
 * Array.length : 배열의 길이를 리턴 
 * 				길이 = 데이터의 개수 = 마지막 인덱스 번호 + 1
 */
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
