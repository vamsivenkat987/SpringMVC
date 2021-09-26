package org.example.config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.logging.Logger;

@Slf4j
public class WebAppInitializer implements WebApplicationInitializer{
    private static final String DISPATCHER_NAME = "dispatcher";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("Configuring webApplication Context to start the application");
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);
        log.info("Dispatch server to start the application from front controller");
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet(DISPATCHER_NAME,dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
