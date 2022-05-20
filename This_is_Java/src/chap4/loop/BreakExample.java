package chap4.loop;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;	// 1~6까지의 난수를 뽑는 코드
			System.out.println(num);
			if(num == 6) {
				break;		// 6이 나오면 break => 반복문을 빠져나감
			}
		}
		System.out.println("프로그램 종료");
	}
}
