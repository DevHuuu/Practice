package chap4.conditional;

/*
 * 1부터 100까지 수 중에 3의 배수이거나 7의 배수인 수의 합을 구하는 프로그램을 만드시오
 * 단, 3과 7의 공배수는 계산되서는 안됩니다.
 */
public class Example04 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			if (i%3 == 0 || i%7 == 0) {
				if(i%(3*7) !=0) {
					System.out.print(i+"+");
					sum += i;
				}
			}
		}
		System.out.println("=" + sum);

	}
}
