import com.wang.Bean.User;
import com.wang.Mapper.UserMapper;
import org.junit.jupiter.api.Test;

public class UserMapperTest {

    @Test
    public void testGetUserByUsername() {
        UserMapper userMapper = new UserMapper();
        User user = userMapper.getUserByUserName("admin");
        System.out.println(user);

    }
}
