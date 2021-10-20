package AccountManagement.loan;

import AccountManagement.AccountType;
import AccountManagement.InterestStrategy;

public class PersonalLoanAccount extends LoanAccount {
    public PersonalLoanAccount(long accountNo, String accountHolderName, int termInMonths) {

        super(accountNo, accountHolderName, AccountType.PERSONAL_LOAN, termInMonths);

        setInterestStrategy(InterestStrategy.COMPOUND);

    }

    @Override

    public double getInterest(int term) {

        return this.getInterestStrategy().getInterest(accountType, amount, term);

    }
}
