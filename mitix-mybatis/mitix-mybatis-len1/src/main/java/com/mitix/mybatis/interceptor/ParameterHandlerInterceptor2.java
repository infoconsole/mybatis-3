package com.mitix.mybatis.interceptor;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * @author oldflame-jm
 * @create 2018/2/25
 * ${DESCRIPTION}
 */
@Intercepts({@Signature(type = ParameterHandler.class, method = "getParameterObject", args = {})})
public class ParameterHandlerInterceptor2 implements Interceptor {

    public ParameterHandlerInterceptor2() {
        System.out.println("---------ParameterHandlerInterceptor 被新建----------");
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("---------ParameterHandlerInterceptor 拦截前----------");
        Object result = invocation.proceed();
        System.out.println(result);
        System.out.println("---------ParameterHandlerInterceptor 拦截后----------");
        return result;
    }

    @Override
    public Object plugin(Object target) {
        //this就是当前的interceptor
        //System.out.println("---------ParameterHandlerInterceptor 代理绑定----------"+target.getClass().getName());
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
