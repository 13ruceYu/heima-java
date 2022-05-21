package com.bobo.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {

    @Insert("insert into tb_log (info, createDate) values(#{info}, now())")
    void log(String info);
}
