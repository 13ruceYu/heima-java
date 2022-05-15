package com.bobo.dao;

import com.bobo.domain.Account;
import org.apache.ibatis.annotations.Select;

public interface AccountDao {

    @Select("select * from stu where id = #{id}")
    Account findById(Integer id);

}
