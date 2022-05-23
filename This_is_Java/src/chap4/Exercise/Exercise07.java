package chap4.Exercise;

import java.util.Scanner;

/*
 * while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
 */
public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("_______________________________");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("_______________________________");
			System.out.print("선택>");
			
			int choise = scanner.nextInt();
			
			if(choise == 1) {
				System.out.print("예금액>");
				int money = scanner.nextInt();
				balance += money;
			}
			else if(choise == 2) {
				System.out.print("출금액>");
				int money = scanner.nextInt();
				balance -= money;
			}
			else if(choise == 3) {
				System.out.println("잔고>" + balance);
			}
			else if(choise == 4) {
				break;
			}
			else {
				System.out.println("잘못된 입력값입니다.");
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
