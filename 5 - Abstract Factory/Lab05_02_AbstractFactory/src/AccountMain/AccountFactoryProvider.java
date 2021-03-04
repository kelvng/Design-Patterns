package AccountMain;

import AccountManagement.deposit.DepositAccountFactory;
import AccountManagement.saving.AccountFactory;
import AccountManagement.loan.LoanAccountFactory;

public class AccountFactoryProvider {
    public static AbstractAccountFactory getAccountFactory(String accountCategory) {

        AbstractAccountFactory accountFactory = null;

        if (accountCategory != null) {

            switch (accountCategory) {

            case "SAVING":

                accountFactory = new AccountFactory();

                break;

            case "LOAN":

                accountFactory = new LoanAccountFactory();

                break;

            case "DEPOSIT":

                accountFactory = new DepositAccountFactory();

                break;

            default:

                break;

            }

        }

        return accountFactory;

    }

}
