package chap4.conditional;

import java.util.Scanner;

/*
 * 입력받은 문자열이 숫자인지 판별하는 프로그램
 * (모든 문자가 숫자 => 숫자, 하나라도 문자 => 숫자가 아니다.)
 */
public class Example06 {
	public static void main(String[] args) {
		boolean isNum = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하여 주세요.");
		System.out.print(">");
		
		String input = scan.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			System.out.print(ch);
			
			if(!(ch >= 48 && ch <=57)) {	//아스키 코드값으로 48=0 부터 57=9까지
				isNum = false;
			}
			
		}
		if(isNum) {
			System.out.println("은/는 숫자입니다.");
		}
		else {
			System.out.println("은/는 숫자가 아닙니다.");
		}
		
		scan.close();
	}
}
