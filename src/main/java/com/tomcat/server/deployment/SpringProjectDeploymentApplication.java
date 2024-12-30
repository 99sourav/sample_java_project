package com.tomcat.server.deployment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Date;

@SpringBootApplication
public class SpringProjectDeploymentApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectDeploymentApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(SpringProjectDeploymentApplication.class);
	}

}
