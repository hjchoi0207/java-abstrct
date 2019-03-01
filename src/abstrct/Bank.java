package abstrct;

public abstract class Bank {
	String name;
	String account;
	int totalAmount;
	
	public Bank() {
		System.out.println("Bank constructor");
	}
	
	public Bank(String name,String account,int total) {
		System.out.println("Bank constructor");
		
		this.name = name;
		this.account = account;
		this.totalAmount = total;
	}
	
	public void deposit() {
		System.out.println("--- deposit() ---");
	}
	
	public void withdraw() {
		System.out.println("--- withdraw() ---");
	}
	
	public abstract void installmentSavings();
	
	public abstract void cancellation();
	
	public void getInfo() {
		System.out.println("name : " + name);
		System.out.println("account : " + account);
		System.out.println("totalAmount : " + totalAmount);
	}
}
