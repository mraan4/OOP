package pack2;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	public Account(int regNumber) {
		super();
		this.regNumber = regNumber;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
