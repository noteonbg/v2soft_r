package mokitopoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	
       
    private UserRepository userRepository;

	@Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        
        	
        	
    }

    public User getUser(Long id) {
        return userRepository.findById(id);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}