package AccountManagement.loan;

import AccountManagement.Account;
import AccountManagement.AccountType;

public abstract class LoanAccount extends Account {
	protected int termInMonths;

    public LoanAccount(long accountNo, String accountHolderName, AccountType accountType, int termInMonths) {

        super(accountNo, accountHolderName, accountType);

        this.termInMonths = termInMonths;

    }


    // since its a loan account, reversing the withdraw and deposit to make it responsibility

    // just to keep the example as simple as possible

    @Override

    public void deposit(double amount) {

        super.withdraw(amount);

    }


    @Override

    public void withdraw(double amount) {

        super.deposit(amount);

    }


    public int getTermInMonths() {

        return termInMonths;

    }


    public void setTermInMonths(int termInMonths) {

        this.termInMonths = termInMonths;

    }
}
