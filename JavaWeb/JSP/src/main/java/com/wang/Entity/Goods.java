package com.wang.Entity;

public class Goods {
    private String brandName;
    private String comName;
    private String introduction;
    private Integer status;

    public Goods(String brandName, String comName, String introduction, Integer status) {
        this.brandName = brandName;
        this.comName = comName;
        this.introduction = introduction;
        this.status = status;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
