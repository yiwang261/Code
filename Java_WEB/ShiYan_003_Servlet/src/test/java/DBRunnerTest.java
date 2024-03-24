import com.wang.Bean.Manager;
import com.wang.Mapper.Impl.ManagerMapperImpl;
import com.wang.Mapper.ManagerMapper;
import com.wang.Utils.DBRunner;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DBRunnerTest {
    @Test
    public void testQuery(){
        DBRunner<Manager> query = new DBRunner<>();
        String sql = "select * from t_manager where username = ? and password = ?";
        List<Manager> result = query.Query(sql, Manager.class, "admin", "123456");

        result.forEach(item ->{
            System.out.println(item);
        });

    }
    @Test
    public void testInsert(){
        DBRunner<Manager> runner = new DBRunner<>();
        String sql = "insert into t_manager  (id, username, password, nickName) values (?, ?, ?, ?)";
        int update = runner.Update(sql, 14, "zhangsan", "zhangsan", "zhangsan");
        System.out.println(update);
    }

    @Test void testDelete(){
        DBRunner<Manager> runner = new DBRunner<>();
        ManagerMapper managerMapper = new ManagerMapperImpl();
        int i  = managerMapper.deleteUser("zhangsan");
//        int i = runner.Update("delete from t_manager where username = ?","zhangsan");
        System.out.println(i);

    }
}
