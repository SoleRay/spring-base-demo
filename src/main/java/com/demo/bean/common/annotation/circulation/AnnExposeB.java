package com.demo.bean.common.annotation.circulation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
public class AnnExposeB implements InitializingBean {

    @Autowired
    private AnnExposeA annExposeA;

    @Override
    public void afterPropertiesSet() throws Exception {
        annExposeA.execute();
    }
}
