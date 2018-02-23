package com.mitix.mybatis;

import com.mitix.mybatis.mapper.CarMapper;
import com.mitix.mybatis.mapper.UserMapper;
import com.mitix.mybatis.model.Car;
import com.mitix.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author oldflame-jm
 * @create 2018/2/12
 * ${DESCRIPTION}
 */
public class MybatisTest {
    public static void main(String[] args) {
        try {

            System.out.println("开始mybatis实验");

            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //从sqlSessionFactory中获取SqlSession
            SqlSession session = sqlSessionFactory.openSession();
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user = userMapper.queryById(2);
//            System.out.println(user.getCreatetime());


            Car car = new Car();
            car.setCarName("dudu");
            car.setCarAge(22);
            car.setCarDesc("测试插入");
            car.setCarCreateTime(new Date());
            CarMapper carMapper = session.getMapper(CarMapper.class);
            carMapper.createCar(car);
            session.commit();
            session.close();
            System.out.println("结束mybatis实验");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
