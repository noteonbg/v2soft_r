package mokitopoc;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
	public User findById(Long id) {

		System.out.println("find by id method");
		return new User(id,"A");
	}

	public void save(User user) {
		System.out.println("save method");
		
	}
}