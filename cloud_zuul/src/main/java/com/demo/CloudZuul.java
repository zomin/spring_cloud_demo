package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class CloudZuul {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuul.class, args);
	}
}
