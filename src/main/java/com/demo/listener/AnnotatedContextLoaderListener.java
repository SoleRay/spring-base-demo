package com.demo.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

public class AnnotatedContextLoaderListener extends ContextLoaderListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        this.setContextInitializers(new AnnotatedApplicationContextInitializer());
        initWebApplicationContext(event.getServletContext());
    }


    private class AnnotatedApplicationContextInitializer implements ApplicationContextInitializer {

        @Override
        public void initialize(ConfigurableApplicationContext applicationContext) {


        }
    }
}
