package com.polaris.intrll.shopingServiceRegister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopingServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopingServiceRegisterApplication.class, args);
	}

}
