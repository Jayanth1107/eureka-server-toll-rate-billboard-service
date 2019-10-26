package com.jayanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServerTollRateBillboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTollRateBillboardServiceApplication.class, args);
	}

}
