package com.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TingConfigServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TingConfigServerApplication.class, args);
		String userName = applicationContext.getEnvironment().getProperty("project.name");
        String userAge = applicationContext.getEnvironment().getProperty("project.org");
        System.err.println("project.name: " +userName+"; project.org: "+userAge);
	}

}
