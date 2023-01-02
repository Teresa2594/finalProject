package com.finalProject.postInfoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PostInfoServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PostInfoServiceApplication.class, args);
	}

}
