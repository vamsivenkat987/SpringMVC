package org.example.config;


import org.example.utils.ViewNames;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "org.example")
public class WebConfig implements WebMvcConfigurer{
    public static final String RESOLVER_PREFIX = "/WEB-INF/view/";
    public static final String RESOLVER_SUFFIX =".jsp";

    @Bean
    public ViewResolver viewResolver(){
//        UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
        InternalResourceViewResolver urlBasedViewResolver = new InternalResourceViewResolver();
        urlBasedViewResolver.setSuffix(RESOLVER_SUFFIX);
        urlBasedViewResolver.setPrefix(RESOLVER_PREFIX);
        return urlBasedViewResolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName(ViewNames.HOME);
    }
}
