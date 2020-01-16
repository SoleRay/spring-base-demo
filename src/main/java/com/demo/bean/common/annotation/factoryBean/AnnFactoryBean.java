package com.demo.bean.common.annotation.factoryBean;

import com.demo.bean.common.base.PlainBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

//@Component
public class AnnFactoryBean implements FactoryBean<PlainBean> , Scope {

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public PlainBean getObject() throws Exception {
        return new PlainBean();
    }

    @Override
    public Class<?> getObjectType() {
        return PlainBean.class;
    }

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        return null;
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
