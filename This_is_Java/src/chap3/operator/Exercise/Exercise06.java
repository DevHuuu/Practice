package chap3.operator.Exercise;

/*
 * 다음은 사다리꼴의 넓이를 구하는 코드입니다. 정확히 소수자릿수가 나올 수 있도록
 * ( #1 )에 알맞은 코드를 작성하세요.
 */
public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		// double area = ( #1 );
		double area = (double)(lengthTop + lengthBottom) / 2 * height;
		System.out.println(area);
	}

}
