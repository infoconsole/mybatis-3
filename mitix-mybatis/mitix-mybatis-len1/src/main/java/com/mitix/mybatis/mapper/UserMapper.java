package com.mitix.mybatis.mapper;

import com.mitix.mybatis.model.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.apache.ibatis.cache.Cache;
//import org.apache.ibatis.annotations.Select;

/**
 * @author oldflame-jm
 * @create 2018/2/12
 * ${DESCRIPTION}
 */
//@CacheNamespaceRef()
//@CacheNamespace
public interface UserMapper {

    //@Select("select * from user where id=#{id}")
    public User queryById(Integer id);
}
