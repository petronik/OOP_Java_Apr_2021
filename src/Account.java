
public class Account {

	private int _number;
	private double _balance;
	
	public Account(int number, double balance) {
		_number = number;
		_balance = balance;
	}
	
	public void deposit(double amount) {
		
		if(amount < 0) {
			// show error
		}
		
		_balance += amount;
	}
	
	public void withdraw( double amount ) {
		
		if(amount < 0) {
			// show error
		}
		
		_balance -= amount;
	}
	
	public String show() {
		return _number + ": $" + _balance;
	}
}
