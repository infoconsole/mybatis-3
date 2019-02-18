package com.mitix.mybatis.spring;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.impl.PerpetualCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author oldflame-jm
 * @since 1.0.0
 */
public class MybatisRedisCache implements Cache {

    private String id;

    public MybatisRedisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>MybatisRedisCache:id=" + id);
        this.id = id;
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void putObject(Object key, Object value) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>putObject:" + key + "=" + value);
    }

    @Override
    public Object getObject(Object key) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>getObject:" + key + "=" + key);
        return null;
    }

    @Override
    public Object removeObject(Object key) {
        System.out.println("remove");
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }

    public void setId(String id) {
        this.id = id;
    }
}
