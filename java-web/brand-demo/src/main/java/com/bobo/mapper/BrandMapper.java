package com.bobo.mapper;

import com.bobo.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
    /**
     * 查询所有
     */
    @Select("select * from tb_brand")
    List<Brand> selectAll();
}
