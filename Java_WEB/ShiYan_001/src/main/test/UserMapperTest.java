import com.wang.Bean.User;
import com.wang.Mapper.UserMapper;
import org.junit.jupiter.api.Test;

public class UserMapperTest {

    @Test
    public void testGetUserById() {
        UserMapper userMapper = new UserMapper();
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }
}
