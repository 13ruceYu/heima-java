package com.bobo.mapper;

import com.bobo.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
    /**
     * 查看所有
     */
    @Select("select * from tb_brand;")
    List<Brand> selectAll();

    /**
     * 查看详情：根据 id 查询
     */
    Brand selectById(int id);

    /**
     * 条件查询：散装参数、对象、map
     */
    // List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
    List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);

    void deleteById(int id);

    void deleteByIds(int[] ids);
}
