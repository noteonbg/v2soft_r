package mockitopoc;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.stubbing.Answer;
import org.mockito.invocation.InvocationOnMock;

// Mocked classes and interfaces
interface UserRepository {
    User findById(int id);
    void save(User user);
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserNameById(int id) {
        User user = userRepository.findById(id);
        return user != null ? user.getName() : null;
    }

    public boolean saveUser(User user) {
        //userRepository.save(user);
        userRepository.save(user);
        return true;
        
    }
}

// Test class
public class UserServiceTest {

    @Test
    void testMockitoFeatures() {
        // 1. Mocking a UserRepository
        UserRepository userRepository = mock(UserRepository.class);

        // 2. Stubbing the findById method to return a mock user
        User mockUser = new User(1, "abc");
        when(userRepository.findById(1)).thenReturn(mockUser);

        // 3. Verifying the behavior of the mocked repository
        UserService userService = new UserService(userRepository);
        assertEquals("abc", userService.getUserNameById(1));
        verify(userRepository,times(1)).findById(1); // Verifying findById(1) was called

        
        // 4. Stubbing void method using doNothing
        doNothing().when(userRepository).save(mockUser);
        assertTrue(userService.saveUser(mockUser)); // Save should return true
        verify(userRepository, times(1)).save(mockUser); // Verifying save was called once

      
        
        // 5. Spying on a real UserRepository (partially mocking)
        UserRepository realRepository = new UserRepositoryImpl();
        UserRepository spyRepository = spy(realRepository);
        when(spyRepository.findById(1)).thenReturn(mockUser); // Stubbing on the spy
        assertEquals("John Doe",userService.getUserNameById(1));
        // Returns mocked user
        verify(spyRepository,times(0)).findById(1); // Verifying that findById was called
        
        
        
        // 6. Answering method calls with custom behavior
        Answer<User> customAnswer = new Answer<User>() {
            @Override
            public User answer(InvocationOnMock invocation) throws Throwable {
                int userId = invocation.getArgument(0);
                return new User(userId, "User " + userId); // Custom answer based on user ID
            }
        };
        when(userRepository.findById(anyInt())).thenAnswer(customAnswer);
        String customUser = userService.getUserNameById(2);
        assertEquals("User 2", customUser); // Custom answer based on user ID

        
        // 7. Throwing exceptions from mocked methods
        when(userRepository.findById(999)).thenThrow(new RuntimeException("User not found"));
        Exception exception = assertThrows(RuntimeException.class, () -> {
            userService.getUserNameById(999); // This should throw an exception
        });
        assertEquals("User not found", exception.getMessage());
        

        // 8. Using argument matchers in verify
        userService.getUserNameById(3);
        verify(userRepository, atLeastOnce()).findById(anyInt()); // Argument matcher (anyInt)
        verify(userRepository).findById(3); // Exact argument match (2)
        
        
       
    }

    // A real UserRepository implementation for demonstration purposes
    static class UserRepositoryImpl implements UserRepository {
        @Override
        public User findById(int id) {
            return new User(id, "Real User");
        }

        @Override
        public void save(User user) {
        	System.out.println("real save method");
        	
            // save logic
        }
    }
}

