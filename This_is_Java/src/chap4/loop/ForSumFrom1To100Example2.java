package chap4.loop;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;	//i를 for문 블록 밖으로 꺼내어 main 메서드 블록 전체에서 사용가능하게 함
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
