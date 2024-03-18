package wang.MapperTest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import wang.Utiis.SqlSessionUtil;
import wang.mapper.CarMapper;
import wang.pojo.Car;

import java.util.List;

public class CarMapperTest {
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        PageHelper.startPage(1,3);
        List<Car> cars = mapper.selectAll();

//        封装分页信息对象
//        由HPageHelper插件提供 用来分页封装相关信息
        PageInfo<Car> carPageInfo = new PageInfo<>(cars,3);

        System.out.println(carPageInfo);
        sqlSession.close();
    }
}
