package com.demo.processor;

import com.demo.bean.common.base.PlainBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
public class MyFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        AbstractBeanDefinition apple = (AbstractBeanDefinition)beanFactory.getBeanDefinition("apple");
        apple.setBeanClass(PlainBean.class);
    }
}
