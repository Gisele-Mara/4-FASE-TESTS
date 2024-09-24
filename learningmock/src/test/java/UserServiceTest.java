import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.mockuser.entities.User;
import com.mockuser.repository.UserRepository;
import com.mockuser.service.UserService;

public class UserServiceTest {
    
    @Test
    public void testCreateaNewUser (){

        UserRepository userRepositoryMock = Mockito.mock(UserRepository.class);
        User userTest = Mockito.mock(User.class);

        UserService userService = new UserService(userRepositoryMock);
        String result = userService.addUserService(userTest);
        assertEquals("User added successfully.", result);
    }

    @Test
    public void testUserAlreadyExists (){

        UserRepository userRepositoryMock = Mockito.mock(UserRepository.class);
        User userTest = Mockito.mock(User.class);

        UserService userService = new UserService(userRepositoryMock);
        when(userRepositoryMock.findByName(any())).thenReturn(true);
        String result = userService.addUserService(userTest);
        assertEquals("User already exists.", result);
    }
}
