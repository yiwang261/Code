import com.wang.Utiis.SqlSessionUtil;
import com.wang.mapper.CarMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class CarMapperTest {
    @Test
    public void testDeleteByPrimaryKey(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        mapper.deleteByPrimaryKey(153L);
        sqlSession.commit();
        sqlSession.close();
    }
}
