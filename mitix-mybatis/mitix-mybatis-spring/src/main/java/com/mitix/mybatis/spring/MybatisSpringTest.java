package com.mitix.mybatis.spring;

import com.mitix.mybatis.spring.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author oldflame-jm
 * @create 2018/2/18
 * ${DESCRIPTION}
 */
public class MybatisSpringTest {
    public static void main(String[] args) {
        //测试ApplicationContext第一个Beans实例
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IUserService service = (IUserService) context.getBean("userServiceImpl");
//        User user=service.queryById(2);
        IAccountService service = (IAccountService) context.getBean("accountServiceImpl");
        service.queryCut();
//        System.out.println(user.getCreatetime());
    }
}
