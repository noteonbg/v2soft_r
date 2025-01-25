package accscenario.dao;

import accscenario.model.AccountStatus;

public interface AccountDao {

	AccountStatus getAccountDetailsFromDB(int accountno, int pin);

}
