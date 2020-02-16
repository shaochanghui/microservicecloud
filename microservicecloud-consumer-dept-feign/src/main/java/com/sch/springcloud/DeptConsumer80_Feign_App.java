package com.sch.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.sch.springcloud.controller.DeptController_Consumer;
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.sch.springcloud"})
@ComponentScan("com.sch.springcloud")
public class DeptConsumer80_Feign_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}
}
