package com.ting.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TingSentinelServerApplication  {

	public static void main(final String[] args) {
		SpringApplication.run(TingSentinelServerApplication.class, args);
	}

	@RestController
	public class TestController {

		@GetMapping(value = "/hello")
		@SentinelResource("hello")
		public String hello() {
			return "Hello Sentinel";
		}

	}


}
