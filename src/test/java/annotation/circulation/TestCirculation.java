package annotation.circulation;

import com.demo.bean.common.annotation.circulation.AnnExposeA;
import com.demo.bean.common.annotation.circulation.AnnExposeB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestCirculation {

//    @Autowired
//    private AnnX annX;

//    @Autowired
//    private AnnSelf annSelf;

    @Autowired
    private AnnExposeA annExposeA;

//    @Autowired
//    private AnnExposeB annExposeB;

    @Test
    public void test(){
        System.out.println(annExposeA.getAnnExposeB());
    }
}
