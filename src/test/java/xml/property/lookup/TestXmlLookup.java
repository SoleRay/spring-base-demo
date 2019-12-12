package xml.property.lookup;

import com.demo.bean.common.annotation.property.lookup.AnnBeanLookup;
import com.demo.bean.common.xml.property.lookup.XmlBeanLookup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestXmlLookup {

    @Autowired
    private XmlBeanLookup xmlBeanLookup;

    @Test
    public void test(){
        System.out.println(xmlBeanLookup);
    }
}
