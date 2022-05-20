package chap4.loop;
/*
 * while(조건식) {
 * 	실행문
 * }
 * 조건식을 만족할 때 까지 무한 반복
 */
public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
}
