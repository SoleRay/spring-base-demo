package service;

import com.demo.bean.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestReflect {

    public static void main(String[] args) {
        Class<Bean> annBeanType = Bean.class;
        Class<Lazy> annLazyType = Lazy.class;
        Class<Autowired> annAutowiredType = Autowired.class;

        List<Class> annList = new ArrayList<>();
        annList.add(annBeanType);
        annList.add(annLazyType);
        annList.add(annAutowiredType);

        for (Method method : ApplicationConfig.class.getDeclaredMethods()) {
            dealWithAnn(method,annList);
        }
    }

    private static void dealWithAnn(Method method, List<Class> annList) {

        for(Class annType : annList){
            if(method.isAnnotationPresent(annType)){
                System.out.println(method.getName() + " has " + annType.getSimpleName());
            }else {
                System.out.println(method.getName() + " don't have " + annType.getSimpleName());
            }
        }
    }
}
