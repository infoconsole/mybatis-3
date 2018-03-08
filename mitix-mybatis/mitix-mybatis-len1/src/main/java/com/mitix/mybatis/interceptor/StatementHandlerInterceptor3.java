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
@Intercepts({@Signature(type = StatementHandler.class, method = "query", args = {Statement.class, ResultHandler.class})})
public class StatementHandlerInterceptor3 implements Interceptor {

    public StatementHandlerInterceptor3() {
        System.out.println("---------StatementHandlerInterceptor 被新建----------");
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("---------StatementHandlerInterceptor 的query拦截前----------");
        Statement statement = (Statement) invocation.getArgs()[0];
        ResultHandler resultHandler = (ResultHandler) invocation.getArgs()[1];
        String handlerName = resultHandler == null ? "null" : resultHandler.getClass().getName();
        System.out.println("---------statement is " + statement.getClass().getName() + " ----------resultHandler is " + handlerName + "-------");
        Object result = invocation.proceed();
        System.out.println("---------StatementHandlerInterceptor 的query拦截后----------");
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
