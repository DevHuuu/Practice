package chap4.loop;
/*
 * break에 이름(라벨)을 붙여 원하는 위치의 반복문을 빠져나가기
 * 이름(라벨): 반복문
 * break 이름(라벨)
 */
public class BreakOutterExample {
	public static void main(String[] args) {
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
