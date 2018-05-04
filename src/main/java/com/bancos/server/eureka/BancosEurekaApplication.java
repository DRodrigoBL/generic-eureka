package com.bancos.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BancosEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancosEurekaApplication.class, args);
	}
}
