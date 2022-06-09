package chap6.exercise;
/*
 * Printer2 객체를 생성하지 않고 PrintExample2 클래스에서 
 * 이전과 같이 호출하려면 Printer2 클래스를 어떻게 수정하면 될까요?
 */
public class Printer2 {
	public static void println(int input) {
		System.out.println(input);
	}
	public static void println(boolean input) {
		System.out.println(input);
	}
	public static void println(double input) {
		System.out.println(input);
	}
	public static void println(String input) {
		System.out.println(input);
	}
}
