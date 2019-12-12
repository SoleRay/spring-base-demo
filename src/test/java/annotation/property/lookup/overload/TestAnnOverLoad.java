package annotation.property.lookup.overload;

import com.demo.bean.common.annotation.property.lookup.overload.AnnBeanOverLoadChild;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestAnnOverLoad {

    @Autowired
    private AnnBeanOverLoadChild annBeanOverLoadChild;

    @Test
    public void test(){
        System.out.println(annBeanOverLoadChild);
    }
}
