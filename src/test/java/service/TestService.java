package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestService {

//    @Autowired
//    private DemoService demoService;



//    @Test
//    public void testDemoService(){
//        List<Demo> demos = demoService.selectAll();
//        System.out.println(demos.size());
//        demoService.add(new Demo());
//    }

    @Test
    public void testBeanA(){
//        BeanA beanA = SpringUtils.getContext().getBean(BeanA.class, 3, "tex", "FUCK");
//        System.out.println(beanA.toString());
//        beanA.getBeanB().eat();
    }

}

