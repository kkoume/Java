package sub1;

public class Account {
	
	//속성(필드) - 이름은 뭔지? 그 사람 계정에 대한 정보
	String bank;
	String id;
	String name;
	int balance;
	
	//기능(메서드)
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
	}
}
