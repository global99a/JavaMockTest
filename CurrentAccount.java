
public class CurrentAccount extends BankAccount {

	@Override
	void deposit(int amount) {
		System.out.println("Amount deposited : "+ amount);
		
	}

	@Override
	void withdraw(int amount) {
		System.out.println("Amount withdrawed : "+ amount);
		
	}
	
}
