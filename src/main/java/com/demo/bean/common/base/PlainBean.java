package com.demo.bean.common.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PlainBean {


    public PlainBean() {
        System.out.println("plainBean created...");
    }
}
