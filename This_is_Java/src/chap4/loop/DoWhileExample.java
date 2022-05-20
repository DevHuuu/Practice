package chap4.loop;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);	
		//System.in.read() 처럼 입력갑을 받는 Scanner클래스 객체를 생성
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") );	//입력값이 q와 같을 때 까지 반복
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
