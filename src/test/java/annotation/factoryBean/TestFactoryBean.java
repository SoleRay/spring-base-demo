package annotation.factoryBean;

import com.demo.bean.common.base.PlainBean;
import com.demo.util.spring.SpringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestFactoryBean {

    @Autowired
    private PlainBean plainBean;

    @Test
    public void test(){
//        Object bean = SpringUtils.getBean("annFactoryBean");
//        Object factoryBean = SpringUtils.getBean("&annFactoryBean");
//        System.out.println(bean);
//        System.out.println(factoryBean);
        System.out.println(plainBean);
    }
}
