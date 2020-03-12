package com.lp.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DonarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonarServiceApplication.class, args);
	}

}
