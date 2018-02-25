package com.mitix.mybatis.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author oldflame-jm
 * @create 2018/2/16
 * ${DESCRIPTION}
 */
public class DataTimeTypeHandler extends BaseTypeHandler<Date> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType) throws SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        ps.setString(i, sdf.format(parameter));
    }

    @Override
    public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String varchartime = rs.getString(columnName);
        if (varchartime != null) {
            System.out.println("开始转化类型columnName=" + columnName);
            return new Date(Long.parseLong(varchartime));
        } else {
            return null;
        }
    }

    @Override
    public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String varchartime = rs.getString(columnIndex);
        if (varchartime != null) {
            return new Date(Long.parseLong(varchartime));
        } else {
            return null;
        }
    }

    @Override
    public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String varchartime = cs.getString(columnIndex);
        if (varchartime != null) {
            return new Date(Long.parseLong(varchartime));
        } else {
            return null;
        }
    }
}
