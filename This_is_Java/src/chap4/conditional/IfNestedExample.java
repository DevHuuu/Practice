package chap4.conditional;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;	//81부터 100까지의 숫자 중 1개를 뽑는다.
		System.out.println("점수 : " + score);
		
		String grade;
		
		if(score>=90) {	
			if(score>=95) {		// score>=90을 만족하면서 세부적으로 조건식을 중첩
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점 : " + grade);
	}
}
