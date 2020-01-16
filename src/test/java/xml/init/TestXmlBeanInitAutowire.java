package xml.init;

import com.demo.bean.common.annotation.init.AnnBeanInitAutowire;
import com.demo.bean.common.xml.init.XmlBeanInitAutowire;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestXmlBeanInitAutowire {

    @Autowired
    private XmlBeanInitAutowire xmlBeanInitAutowire;

    @Test
    public void test(){
        xmlBeanInitAutowire.getBeanName();
//        System.out.println(annBeanPropAutowire.getAnnMap().get("plainBean"));
    }
}
