package MapperTest;

import com.wang.Bean.Brands;
import com.wang.Bean.Goods;
import com.wang.Mapper.GoodsMapper;
import com.wang.Mapper.Impl.GoodsMapperImpl;
import com.wang.Utils.DBRunner;
import org.junit.jupiter.api.Test;

public class GoodsMapperTest {
    private GoodsMapper goodsMapper = new GoodsMapperImpl();

    @Test
    public void testSelectAll(){
        goodsMapper.SelectAll().forEach(System.out::println);
    }
    @Test
    public void testDeleteById(){
        int i = goodsMapper.deleteById(9);
        System.out.println(i);
    }
    @Test
    public void testFindById(){
        Goods byId = goodsMapper.findById(8);
        System.out.println(byId);
    }

    @Test
    public void testBrand(){
        Brands brands = new Brands();

    }
}
