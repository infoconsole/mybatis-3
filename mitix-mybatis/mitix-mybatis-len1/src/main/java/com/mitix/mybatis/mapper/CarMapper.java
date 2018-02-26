package com.mitix.mybatis.mapper;

import com.mitix.mybatis.model.Car;
import org.apache.ibatis.annotations.Flush;
//import org.apache.ibatis.annotations.Select;

/**
 * @author oldflame-jm
 * @create 2018/2/12
 * ${DESCRIPTION}
 */
//@CacheNamespaceRef()
//@CacheNamespace
public interface CarMapper {
    public void createCar(Car car);
}
