package abstrct;

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
