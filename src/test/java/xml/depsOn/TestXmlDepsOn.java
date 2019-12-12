package xml.depsOn;

import com.demo.bean.common.annotation.depsOn.AnnBeanDepOn;
import com.demo.bean.common.xml.depsOn.XmlBeanDepOn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestXmlDepsOn {

    @Autowired
    private XmlBeanDepOn xmlBeanDepOn;

    @Test
    public void test(){
        System.out.println(xmlBeanDepOn);
    }
}
