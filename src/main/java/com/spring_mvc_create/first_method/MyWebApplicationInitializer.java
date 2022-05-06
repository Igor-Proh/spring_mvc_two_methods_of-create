package com.spring_mvc_create.first_method;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();
        context.register(MyFirstAppConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", dispatcherServlet);

        registration.setLoadOnStartup(1);

        registration.addMapping("/app/*");
    }
}
