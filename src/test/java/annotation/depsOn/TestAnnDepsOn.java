package annotation.depsOn;

import com.demo.bean.common.annotation.construct.AnnBeanConstruct;
import com.demo.bean.common.annotation.depsOn.AnnBeanDepOn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestAnnDepsOn {

    @Autowired
    private AnnBeanDepOn annBeanDepOn;

    @Test
    public void test(){
        System.out.println(annBeanDepOn);
    }
}
