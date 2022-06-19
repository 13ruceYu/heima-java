package com.bobo.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bobo.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
