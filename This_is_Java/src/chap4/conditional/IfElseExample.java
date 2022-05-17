package chap4.conditional;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {	//score>=90 이 아닌 경우 모두 해당 -> score<90
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}
}
