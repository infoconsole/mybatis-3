package com.mitix.mybatis.model;

import java.util.Date;

/**
 * @author oldflame-jm
 * @create 2018/2/22
 * ${DESCRIPTION}
 */
public class Car {
    private int id;
    private String carName;
    private int carAge;
    private String carDesc;
    private Date carCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getCarDesc() {
        return carDesc;
    }

    public void setCarDesc(String carDesc) {
        this.carDesc = carDesc;
    }

    public Date getCarCreateTime() {
        return carCreateTime;
    }

    public void setCarCreateTime(Date carCreateTime) {
        this.carCreateTime = carCreateTime;
    }
}
