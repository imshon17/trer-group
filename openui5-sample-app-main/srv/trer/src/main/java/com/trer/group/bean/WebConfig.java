package com.trer.group.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/login")
				.allowedOrigins("*")
				.allowedMethods("GET", "POST")
				.allowedHeaders("*")
				.allowCredentials(false)
				.maxAge(3600);
	}
}
