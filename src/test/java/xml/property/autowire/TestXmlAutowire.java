package xml.property.autowire;

import com.demo.bean.common.xml.property.autowire.XmlBeanAutowire;
import com.demo.bean.common.xml.property.lookup.XmlBeanLookup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestXmlAutowire {

    @Autowired
    private XmlBeanAutowire xmlBeanAutowire;

    @Test
    public void test(){
        System.out.println(xmlBeanAutowire.getPlainBean());
    }
}
