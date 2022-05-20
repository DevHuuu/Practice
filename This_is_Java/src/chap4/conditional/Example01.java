package chap4.conditional;

import java.util.Scanner;

/*
 * 사용자에게 국어점수 영어점수 수학점수를 각각 받은 후 평균 점수를 계산해
 * 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 60점 미만이면 F를 출력하는
 * 학점 계산 프로그램을 만드시오
 */
public class Example01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		System.out.print(">");
		int korean = scan.nextInt();
		
		System.out.println("영어점수를 입력하세요.");
		System.out.print(">");
		int english = scan.nextInt();
		
		System.out.println("수학점수를 입력하세요.");
		System.out.print(">");
		int math = scan.nextInt();
				
		int avg = (korean + english +math) / 3;
		
		char grade;
		
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg>=80) {
			grade = 'B';
		} 
		else if(avg>=70) {
			grade = 'C';
		} 
		else if(avg>=60) {
			grade = 'D';
		} 
		else  {
			grade = 'F';
		} 
		
		System.out.println("평균점수는 " + avg + "점이고, 등급은 " + grade + " 입니다.");
		scan.close();
	}
}
