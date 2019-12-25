package com.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TingConfigServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TingConfigServerApplication.class, args);
		String name = applicationContext.getEnvironment().getProperty("project.name");
        String org = applicationContext.getEnvironment().getProperty("project.org");
        String item = applicationContext.getEnvironment().getProperty("project.item");
        System.err.println("project.name: " + name + "; project.org: " + org + "; project.item: " + item);
	}

}
