package chap10.account;

//사용자 정의 예외 발생시키기
public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientExample {
		if(balance < money) {
			throw new BalanceInsufficientExample("잔고부족:" + (money-balance)+ "모자람");
		}
		balance -= money;
	}
}
