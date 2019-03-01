## abstrct Class


```
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
```

- 추상클래스를 한 번 더 공부하여 이해를 돕도록 했다. **installmentSavings()과 cancellation()** 는 현재 추상메소드이다.
이는 Bank Class를 상속받는 클래스에서 재정의 하도록 한다.

***

```
public class MyBank extends Bank{
	
	public MyBank(String name,String account,int total) {
		super(name,account,total);
	}

	@Override
	public void installmentSavings() {
		System.out.println("--- installmentSavings() ---");
	}

	@Override
	public void cancellation() {
		System.out.println("--- cancellation() ---");
	}

}
```

- MyBank 클래스에서 정의되어진 추상클래스들 그리고 생성자는 super를 이용하여 상위 클래스에게 넘겨준다.

***

```
public class MainClass {

	public static void main(String[] args) {
		
		Bank myBank = new MyBank("Park","123-4567-89",100);
		
		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();
		
		System.out.println();
		
		myBank.getInfo();
	}

}
```

- MainClass에서 이가 올바르게 작동하는지 확인해본다.
***
**실행결과**
```
Bank constructor
--- deposit() ---
--- withdraw() ---
--- installmentSavings() ---
--- cancellation() ---

name : Park
account : 123-4567-89
totalAmount : 100
```
