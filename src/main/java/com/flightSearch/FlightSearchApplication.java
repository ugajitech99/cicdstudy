package com.flightSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.*")
@ComponentScan("com.*")
@EntityScan("com.*")
//@EnableDiscoveryClient
@EnableAutoConfiguration
public class FlightSearchApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FlightSearchApplication.class, args);
	}
}
