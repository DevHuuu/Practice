package chap5.referencevar;

import java.util.Scanner;

/*
 * 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
 * 실행 결과를 보고, 알맞게 작성해보세요.
 */
public class Example09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("______________________________________________");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("______________________________________________");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 작성위치
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				// 작성위치
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				// 작성위치
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);

				}
			} else if (selectNo == 4) {
				// 작성위치
				int sum = 0;
				int temp = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (temp < scores[i]) {
						temp = scores[i];
					}
				}
				double avg = (double) sum / scores.length;
				System.out.println("최고 점수: " + temp);
				System.out.println("평균 점수: " + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
