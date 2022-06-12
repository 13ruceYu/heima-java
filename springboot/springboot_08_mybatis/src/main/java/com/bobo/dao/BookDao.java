package com.bobo.dao;

import com.bobo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
