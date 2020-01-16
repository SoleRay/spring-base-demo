package com.demo.bean.common.annotation.config;

import com.demo.bean.common.base.PlainBean;

public class AnnBeanConfig {

    private int age;

    private String name;

    private PlainBean plainBean;

    public AnnBeanConfig() {
    }

    public AnnBeanConfig(int age, String name, PlainBean plainBean) {
        this.age = age;
        this.name = name;
        this.plainBean = plainBean;
    }
}
