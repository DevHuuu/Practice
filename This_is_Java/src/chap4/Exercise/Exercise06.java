package chap4.Exercise;
/*
 * for문을 이용해서 실행결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Exercise06 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		}
	}
	
}
