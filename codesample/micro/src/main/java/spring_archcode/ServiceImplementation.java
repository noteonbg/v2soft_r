package spring_archcode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceImplementation implements ServiceInf {
	
	private DAOInterface daoInterface;
	
	

	@Autowired
	public ServiceImplementation(DAOInterface x) {
		// TODO Auto-generated constructor stub
	//	daoInterface = new ListBasedMockDAOImplementation();
		
		//daoInterface = new MapBasedMockDAOImplementation();

		//daoInterface = new JDBCImplemntation();
		System.out.println("service created , dao wired");
		daoInterface=x;
		
	}



	@Override
	public boolean registerUser(CUser user) {
		// TODO Auto-generated method stub
		
		boolean insertStatus = false;		
		try {
			daoInterface.registerUserInDb(user);
			insertStatus=true;
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertStatus;
	}



	@Override
	public CUser getUserDetails(String userid) {
		// TODO Auto-generated method stub
		CUser user = daoInterface.getUserDetailsFromDb(userid);
		return user;
	}



	@Override
	public boolean updateUserDetails(CUser user) {
		// TODO Auto-generated method stub
		return daoInterface.updateDetailsInDb(user);
	}



	@Override
	public boolean removeUser(String userid) {
		// TODO Auto-generated method stub
		return daoInterface.removeUserInDb(userid);
	}



	@Override
	public List<CUser> getUsersBasedOnPincode(int pincode) {
		// TODO Auto-generated method stub
		return daoInterface.getAllUsersFromDBBasedonPincode(pincode);
	}

}
