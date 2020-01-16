package annotation.init;

import com.demo.bean.common.base.InitBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestInitBean {

    @Autowired
//    private InitBean initBean;

    @Test
    public void test(){
//        System.out.println(initBean);
    }
}
