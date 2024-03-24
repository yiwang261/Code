package com.wang.Mapper.Impl;

import com.wang.Bean.Goods;
import com.wang.Mapper.GoodsMapper;
import com.wang.Utils.DBRunner;

import com.wang.Utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GoodsMapperImpl implements GoodsMapper {
    private DBRunner<Goods> runner = new DBRunner<>();

    private String selectAllSql =  "select t_goods.id    id, " +
            "t_goods.goodNo       goodNo," +
            "t_goods.firstType_id firstType_id," +
            "t_goods.sectype_id   secType_id," +
            "t_goods.inPrice      inPrice, " +
            "t_goods.outPrice     outPrice," +
            "t_goods.produceDate  produceTime," +
            "t_goods.shelfTime    shelfTime," +
            "t_brand.name         name," +
            "t_firsttype.name     firstType," +
            "t_sectype.name       secType from wang.t_goods  " +
            "left join wang.t_brand       on wang.t_brand.id     = wang.t_goods.brandId "+
            "left join wang.t_firsttype   on wang.t_firsttype.id = wang.t_goods.firstType_id "+
            "left join wang.t_secType     on wang.t_sectype.id   = wang.t_goods.sectype_id";
    @Override
    public List<Goods> SelectAll() {


        return runner.Query(selectAllSql, Goods.class);
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "delete from t_goods where id = ? ";
        return runner.Update(sql,id);
    }

    @Override
    public Goods findById(Integer id) {
        String sql =selectAllSql+ " where t_goods.id = ? ";
        return runner.Query(sql, Goods.class, id).get(0);
    }
}
