package service;

import com.demo.entity.demo.Demo;
import com.demo.service.demo.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestService {

    @Autowired
    private DemoService demoService;

    @Autowired
    private SecondDemoService secondDemoService;

    @Autowired
    private OtherService otherService;

    @Test
    public void testDemoService(){
//        List<Demo> demos = demoService.selectAll();
//        System.out.println(demos.size());

        demoService.add(new Demo());
    }

    @Test
    public void testOtherService(){
        otherService.add(new Demo());
    }

    @Test
    public void testSecondDemoService(){
        secondDemoService.add(new Demo());
    }

}

