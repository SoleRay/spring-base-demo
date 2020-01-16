package annotation.property.autowire;

import com.demo.bean.common.annotation.property.autowire.AnnBeanPropAutowire;
import com.demo.bean.common.base.PlainBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestAnnPropAutowire {

    @Autowired
    private AnnBeanPropAutowire annBeanPropAutowire;


    @Test
    public void test(){
//        System.out.println(annBeanPropAutowire.getFruit());
//        System.out.println(annBeanPropAutowire.getAnnMap().get("plainBean"));
    }
}
