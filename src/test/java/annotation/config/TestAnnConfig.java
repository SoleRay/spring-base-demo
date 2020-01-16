package annotation.config;

import com.demo.bean.common.annotation.config.AnnBeanConfig;
import com.demo.bean.common.annotation.construct.AnnBeanConstruct;
import com.demo.bean.config.ApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestAnnConfig {

    @Autowired
    private ApplicationConfig applicationConfig;

    @Test
    public void test() throws Exception{
        Field f = applicationConfig.getClass().getField("$$beanFactory");
        Method[] declaredMethods = applicationConfig.getClass().getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method.getName());
        }
        Object beanFactory = f.get(applicationConfig);
        System.out.println(beanFactory);
    }
}
