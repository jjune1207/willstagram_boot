package com.willsta.boot;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class ServletConfig implements  WebMvcConfigurer, WebMvcRegistrations {
	
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
    	viewControllerRegistry.addViewController("/").setViewName("index");
    	//viewControllerRegistry.addRedirectViewController("/", "/index.jsp");
    }
}
