package com.demo.context;

import com.demo.bean.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class MyXmlWebApplicationContext extends XmlWebApplicationContext {

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.customizeBeanFactory(beanFactory);
        AnnotationConfigUtils.registerAnnotationConfigProcessors(BeanDefinitionRegistry.class.cast(beanFactory));
        AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(ApplicationConfig.class);
        String beanName = StringUtils.uncapitalize(ApplicationConfig.class.getSimpleName());
        beanFactory.registerBeanDefinition(beanName,beanDefinition);
    }
}
