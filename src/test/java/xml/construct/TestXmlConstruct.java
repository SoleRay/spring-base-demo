package xml.construct;

import com.demo.bean.common.annotation.construct.AnnBeanConstruct;
import com.demo.bean.common.xml.construct.XmlBeanConstruct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestXmlConstruct {

    @Autowired
    private XmlBeanConstruct xmlBeanConstruct;

    @Test
    public void test(){
        System.out.println(xmlBeanConstruct);
    }
}
