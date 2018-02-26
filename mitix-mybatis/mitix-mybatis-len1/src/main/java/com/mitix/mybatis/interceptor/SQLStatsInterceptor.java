package com.mitix.mybatis.interceptor;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @author oldflame-jm
 * @create 2018/2/16
 * ${DESCRIPTION}
 */
//@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
//        RowBounds.class, ResultHandler.class})})
public class SQLStatsInterceptor implements Interceptor {
    private final Logger logger = LoggerFactory.getLogger(SQLStatsInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("---------log 拦截以前----------");
        Object result = invocation.proceed();
        System.out.println("---------log 拦截以后----------");
        return result;
    }

    @Override
    public Object plugin(Object target) {
        //this就是当前的interceptor
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String dialect = properties.getProperty("dialect");
        System.out.println("mybatis intercept dialect:{" + dialect + "}");
        logger.info("mybatis intercept dialect:{}", dialect);
    }
}
