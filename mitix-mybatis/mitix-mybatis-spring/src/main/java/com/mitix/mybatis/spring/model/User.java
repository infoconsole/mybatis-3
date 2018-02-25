package com.mitix.mybatis.spring.model;

import java.util.Date;

/**
 * @author oldflame-jm
 * @create 2018/2/12
 * ${DESCRIPTION}
 */
public class User {

    private int id;
    private String name;
    private int age;
    private String desc;
    private Date createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
