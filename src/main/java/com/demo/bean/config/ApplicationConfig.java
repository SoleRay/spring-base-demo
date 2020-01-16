package com.demo.bean.config;

import com.demo.bean.common.annotation.config.AnnBeanConfig;
import com.demo.bean.common.annotation.construct.AnnBeanConstruct;
import com.demo.bean.common.annotation.factoryBean.AnnFactoryBean;
import com.demo.bean.common.annotation.init.AnnBeanInitAutowire;
import com.demo.bean.common.base.Apple;
import com.demo.bean.common.base.GreenApple;
import com.demo.bean.common.base.PlainBean;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
//@ComponentScan(basePackages = "com.demo")
public class ApplicationConfig {

//    @Bean
//    public AnnFactoryBean annFactoryBean(GreenApple greenApple){
//        System.out.println(greenApple);
//        return new AnnFactoryBean();
//    }

//    @Bean(initMethod = "init",destroyMethod = "destroy")
//    public InitBean getInitBean(){
//        return new InitBean();
//    }

//    private String $$beanFactory;

//    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
//    @Lazy
//    public AnnBeanInitAutowire getAnnBeanInitAutowire(){
//        return new AnnBeanInitAutowire();
//    }

    @Bean
    @Lazy
    public AnnBeanConfig annBeanConfig(PlainBean plainBean){
        return new AnnBeanConfig(15,"box",plainBean);
    }


}
