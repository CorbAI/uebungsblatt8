
public class CheckingAccount extends Account {
	// Gebuehr für Abhebungen
	private int feeInCents;

	public CheckingAccount(String accountNumber, Person holder, int feeInCents) {
		super(accountNumber, holder);
		this.feeInCents = feeInCents;
	}

	@Override
	public boolean withdraw(int amountInCents) {
		return super.withdraw(amountInCents + feeInCents);
	}
}
