package annotation.init;

import com.demo.bean.common.annotation.init.AnnBeanInitAutowire;
import com.demo.bean.common.annotation.property.autowire.AnnBeanPropAutowire;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestAnnBeanInitAutowire {

    @Autowired
    private AnnBeanInitAutowire annBeanInitAutowire;

    @Test
    public void test(){
        annBeanInitAutowire.getBeanName();
//        System.out.println(annBeanPropAutowire.getAnnMap().get("plainBean"));
    }
}
