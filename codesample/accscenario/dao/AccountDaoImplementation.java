package accscenario.dao;

import accscenario.model.Account;
import accscenario.model.AccountStatus;

public class AccountDaoImplementation implements AccountDao {

	@Override
	public AccountStatus getAccountDetailsFromDB(int accountno, int pin) {
		// TODO Auto-generated method stub

		System.out.println("Account dao implementation ");
		AccountStatus accountStatus = new AccountStatus(0, "not working in dao", 
				new Account(0, "A", 0, 0, 0));
		System.out.println("returning from DAO");
		return accountStatus;// kids will always cry when models are used.. becuase of addiction to int

	}

}
