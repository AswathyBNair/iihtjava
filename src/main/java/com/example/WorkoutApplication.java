package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan({"com.example.dao"})
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
public class WorkoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutApplication.class, args);
		System.out.println("hifrom");
	}
	
	 @SuppressWarnings("deprecation")
	@Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurerAdapter() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/addCategory").allowedOrigins("http://localhost:4200");
	            }
	        };
	    }
}
