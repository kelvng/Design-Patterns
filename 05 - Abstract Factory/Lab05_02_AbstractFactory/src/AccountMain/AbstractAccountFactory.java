package AccountMain;

import AccountManagement.Account;
import AccountManagement.AccountOpeningDetails;

public abstract class AbstractAccountFactory {
	public abstract Account createAccount(AccountOpeningDetails opendingDetails);
}
