package com.mitix.mybatis.spring.model;

/**
 * @author oldflame-jm
 * @create 2018/9/1
 * ${DESCRIPTION}
 */
public class Account {
    private int id;
    private int user_id;
    private String mobile;
    private int cut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getCut() {
        return cut;
    }

    public void setCut(int cut) {
        this.cut = cut;
    }
}
