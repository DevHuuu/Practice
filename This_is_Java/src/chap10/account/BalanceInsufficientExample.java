package chap10.account;

//사용자 정의 예외 클래스
public class BalanceInsufficientExample extends Exception{
	public BalanceInsufficientExample() {}
	public BalanceInsufficientExample(String message) {
		super(message);
	}
}
