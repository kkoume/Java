package sub2;

public class Account {
	
	//속성(필드)
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	//생성자(Constructor) - 캡슐화된 속성을 초기화하기 위한 메서드
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
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
