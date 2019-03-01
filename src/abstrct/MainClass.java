package abstrct;

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
