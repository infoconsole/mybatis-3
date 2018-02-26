package com.mitix.mybatis.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * @author oldflame-jm
 * @create 2018/2/25
 * ${DESCRIPTION}
 */
@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
        RowBounds.class, ResultHandler.class})})
public class ExecutorInterceptor implements Interceptor {

    public ExecutorInterceptor() {
        System.out.println("---------ExecutorInterceptor 被新建----------");
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("---------ExecutorInterceptor 拦截前----------");
        Object result = invocation.proceed();
        System.out.println("---------ExecutorInterceptor 拦截后----------");
        return result;
    }

    @Override
    public Object plugin(Object target) {
        //this就是当前的interceptor
        //System.out.println("---------ExecutorInterceptor 代理绑定----------"+target.getClass().getName());
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
