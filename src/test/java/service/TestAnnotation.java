package service;

import com.demo.bean.config.ApplicationConfig;

import java.lang.annotation.Annotation;

public class TestAnnotation {

    public static void main(String[] args) {
        Annotation[] annotations = ApplicationConfig.class.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation);
            System.out.println(annotation.annotationType());
        }
    }
}
