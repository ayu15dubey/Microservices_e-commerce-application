package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonService1Application {

	public static void main(String[] args) {
		SpringApplication.run(RibbonService1Application.class, args);
	}

	
}
