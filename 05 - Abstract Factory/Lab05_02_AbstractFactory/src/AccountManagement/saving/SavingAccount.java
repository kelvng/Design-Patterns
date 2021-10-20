package AccountManagement.saving;

import AccountManagement.Account;
import AccountManagement.AccountType;
import AccountManagement.InterestStrategy;

public class SavingAccount extends Account {
	public SavingAccount(long accountNo, String accountHolderName) {

        super(accountNo, accountHolderName, AccountType.SAVING);

        setInterestStrategy(InterestStrategy.COMPOUND);

    }

    @Override

    public double getInterest(int term) {

        return this.getInterestStrategy().getInterest(accountType, amount, term);

    }
}
