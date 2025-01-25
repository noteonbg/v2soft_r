package accscenario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import accscenario.dao.AccountDao;
import accscenario.dao.AccountDaoImplementation;
import accscenario.model.AccountStatus;

@Component
public class AccountServiceImplementation implements AccountService {
	
	@Autowired
	private AccountDao accountdao;
	
	
	
		public AccountServiceImplementation() {
			
			//accountdao =new AccountDaoImplementation();
			
			
		
		// TODO Auto-generated constructor stub
	}



		@Override
	public AccountStatus getBalance(int accountno, int pin) {
		// TODO Auto-generated method stub
			System.out.println("in the service function , about to call dao ");
		AccountStatus i = accountdao.getAccountDetailsFromDB(accountno,pin);
		System.out.println("finished returning from dao , in service function");
		return i;
		
	}

}
