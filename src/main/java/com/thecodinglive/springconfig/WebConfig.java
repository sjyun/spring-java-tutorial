package com.thecodinglive.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.thecodinglive.controller")
public class WebConfig extends WebMvcConfigurerAdapter {


	@Override
	public void addResourceHandlers( ResourceHandlerRegistry registry){
		registry.addResourceHandler("/resources/*").addResourceLocations("/resources/");
	}

	@Override
	public void addViewControllers( org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry){

		//registry.addViewController("/home").setViewName("/home");
	}






	@Bean
	public UrlBasedViewResolver setupViewResolver(){
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

}