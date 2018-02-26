package com.mitix.mybatis.interceptor;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

import java.sql.Statement;
import java.util.Properties;

/**
 * @author oldflame-jm
 * @create 2018/2/25
 * ${DESCRIPTION}
 */
@Intercepts({@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})})
public class ResultSetHandlerInterceptor implements Interceptor {
    public ResultSetHandlerInterceptor() {
        System.out.println("---------ResultSetHandlerInterceptor 被新建----------");
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("---------ResultSetHandlerInterceptor 拦截前----------");
        Object result = invocation.proceed();
        System.out.println("---------ResultSetHandlerInterceptor 拦截后----------");
        return result;
    }

    @Override
    public Object plugin(Object target) {
        //this就是当前的interceptor
        //System.out.println("---------ResultSetHandlerInterceptor 代理绑定----------"+target.getClass().getName());
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
