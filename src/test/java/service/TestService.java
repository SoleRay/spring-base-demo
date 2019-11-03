package service;

import com.demo.entity.demo.Demo;
import com.demo.service.demo.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:applicationContext-mybatis.xml"})
public class TestService {

    @Autowired
    private DemoService demoService;

    @Test
    public void testDemoService(){
        List<Demo> demos = demoService.selectAll();
        System.out.println(demos.size());
    }
}
