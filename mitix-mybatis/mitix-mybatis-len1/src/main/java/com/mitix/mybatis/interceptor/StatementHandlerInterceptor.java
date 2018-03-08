package com.mitix.mybatis.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author oldflame-jm
 * @create 2018/2/25
 * ${DESCRIPTION}
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class StatementHandlerInterceptor implements Interceptor {

    public StatementHandlerInterceptor() {
        System.out.println("---------StatementHandlerInterceptor 被新建----------");
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("---------StatementHandlerInterceptor 的prepare拦截前----------");
        Connection connection = (Connection) invocation.getArgs()[0];
        Integer transactionTimeout = (Integer) invocation.getArgs()[1];
        System.out.println("---------connection is " + connection.toString() + "----------transactionTimeout is " + transactionTimeout + "----");
        Object result = invocation.proceed();
        System.out.println("---------StatementHandlerInterceptor 的prepare拦截后----------");
        return result;
    }

    @Override
    public Object plugin(Object target) {
        //this就是当前的interceptor
        //System.out.println("---------StatementHandlerInterceptor 代理绑定-------"+target.getClass().getName());
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
