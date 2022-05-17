package chap4.conditional;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score<90)									// 실행문이 1문장 일 때는 {} 생략 가능 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");			// 때문에 이 구문은 if 조건문의 실행문이 아니라 항상 실행된다.
		
	}
}
