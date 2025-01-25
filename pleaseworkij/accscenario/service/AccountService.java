package accscenario.service;

import accscenario.model.AccountStatus;

public interface AccountService {

	AccountStatus getBalance(int accountno, int pin);

}
