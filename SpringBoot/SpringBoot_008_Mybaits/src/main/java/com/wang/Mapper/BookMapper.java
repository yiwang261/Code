package com.wang.Mapper;

import com.wang.Bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
@Mapper
public interface BookMapper {

    @Select("select * from wang.book where id = #{id}")
    Book getById(String id);
}
