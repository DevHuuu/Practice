package unaryoperator;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;	// true -> false로 반전
		System.out.println(play);
		
		play = !play;	// false -> true로 반전
		System.out.println(play);
	}
}
