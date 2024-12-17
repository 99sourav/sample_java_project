package com.tomcat.server.deployment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringProjectDeploymentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectDeploymentApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("executing the job " + new Date());
	}
}
