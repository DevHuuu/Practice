package chap4.loop;
/*
 * continue : continue문 이후의 문장을 실행하지 않고 다음 반복회차를 시작한다.
 */
public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {	//홀수인 경우엔 continue => 다음 반복회차를 실행
				continue;
			}
			System.out.println(i);
		}
	}
}
