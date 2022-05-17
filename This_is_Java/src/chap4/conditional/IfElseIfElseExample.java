package chap4.conditional;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) {								// 조건식 1
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {						// 조건식 2
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {						// 조건식 3
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {										// 위 조건식들에 모두 해당하지 않을 때
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
}
