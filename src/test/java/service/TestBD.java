package service;

import com.demo.util.spring.SpringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestBD {

    public void testRootBD(){
//        MyBeanDefinition mbd = new MyBeanDefinition(Apple.class);
//        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
//        argumentValues.addGenericArgumentValue("red");
//        argumentValues.addGenericArgumentValue("circle");
//        mbd.setConstructorArgumentValues(argumentValues);
//        DefaultListableBeanFactory factory = (DefaultListableBeanFactory) SpringUtils.getContext().getAutowireCapableBeanFactory();
//        factory.registerBeanDefinition("apple",mbd);
//        Apple apple = factory.getBean("apple", Apple.class);
//        System.out.println(apple);
    }

    @Test
    public void testBeanFactoryPostProcessor(){

//        Object apple = SpringUtils.getBean("apple");
//        System.out.println(apple);
    }

}
