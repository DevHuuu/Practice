package chap4.conditional;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;	// 1~6까지 난수를 뽑아 num에 값을 대입
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");	// 1~5가 모두 아니라면 경우의 수는 6 밖에 없음.
		}
	}
}
