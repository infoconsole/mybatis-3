package com.mitix.mybatis;

import com.mitix.mybatis.model.User;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author oldflame-jm
 * @create 2018/2/16
 * ${DESCRIPTION}
 */
public class ExampleObjectFactory extends DefaultObjectFactory {
    @Override
    public Object create(Class type) {
        if (type.equals(User.class)) {
            User u = (User) super.create(type);
            u.setAge(22);
            u.setName("infotech");
            return u;
        }
        return super.create(type);
    }

    @Override
    public void setProperties(Properties properties) {
        Iterator iterator = properties.keySet().iterator();
        while (iterator.hasNext()) {
            String keyValue = String.valueOf(iterator.next());
            System.out.println(properties.getProperty(keyValue));
        }
        super.setProperties(properties);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return Collection.class.isAssignableFrom(type);
    }
}
