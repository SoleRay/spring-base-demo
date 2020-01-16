package annotation.depsOn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestDefaultDepsOn {

//    @Autowired
//    private BeanFactory beanFactory;
//
//    @Autowired
//    private ResourceLoader resourceLoader;
//
//    @Autowired
//    private ApplicationEventPublisher applicationEventPublisher;
//
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test(){

//        System.out.println(beanFactory);
//        System.out.println(resourceLoader);
//        System.out.println(applicationEventPublisher);
        System.out.println(applicationContext.getBean(BeanFactory.class));

    }
}
