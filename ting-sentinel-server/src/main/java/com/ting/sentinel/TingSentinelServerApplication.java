package com.ting.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TingSentinelServerApplication  {

	public static void main(final String[] args) {
		SpringApplication.run(TingSentinelServerApplication.class, args);
	}

}
