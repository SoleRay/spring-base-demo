package xml.parent;

import com.demo.bean.common.xml.parent.XmlBeanChild;
import com.demo.bean.common.xml.parent.XmlBeanParent;
import com.demo.bean.common.xml.property.lookup.XmlBeanLookup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestXmlParent {

    @Autowired
    private XmlBeanChild xmlBeanChild;

    @Test
    public void test(){
        System.out.println(xmlBeanChild);
    }
}
