package com.demo.bean.common.base;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RedApple extends Apple {

    public RedApple() {
        System.out.println("redapp...");
    }
}
