package com.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
//开启hystrix功能
@EnableHystrix
//开启熔断监控功能
@EnableHystrixDashboard
public class EurekaClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientOneApplication.class, args);
	}
}
