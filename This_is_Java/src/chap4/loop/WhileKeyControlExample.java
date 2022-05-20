package chap4.loop;
/*
 * 키보드로 키 입력(1, 2, 3)을 받아서 입력값에 따라 실행문을 제어하는 코드
 */
public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception { 
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("_____________________");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("_____________________");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();	//입력값을 받아 keyCode에 값을 대입
			
			if(keyCode == 49) {	//1을 읽었을 때
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 50) { //2를 읽었을 때
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 51) { //3을 읽었을 때
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
