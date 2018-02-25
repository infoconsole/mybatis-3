package com.mitix.mybatis.spring.mapper;

import com.mitix.mybatis.spring.model.User;
import org.mybatis.spring.annotation.MapperScan;
//import org.apache.ibatis.annotations.Select;

/**
 * @author oldflame-jm
 * @create 2018/2/12
 * ${DESCRIPTION}
 */
//@CacheNamespaceRef()
//@CacheNamespace
//@MapperScan
public interface UserMapper {

    //@Select("select * from user where id=#{id}")
    public User queryById(Integer id);
}
