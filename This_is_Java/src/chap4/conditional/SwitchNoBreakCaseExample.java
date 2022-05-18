package chap4.conditional;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;	//8부터 11까지의 정수 뽑기
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		// break가 없다면 case에 해당하는 실행문을 실행하고 제어문이 종료되지 않고 그 아래의 실행문들도 계속 실행이 된다.
		}
	}
}
