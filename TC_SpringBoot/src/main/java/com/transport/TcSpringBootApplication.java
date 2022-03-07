package com.transport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.transport.repository")
@EntityScan("com.transport.bean")
@ComponentScan(basePackages = {"com.transport.controller","com.transport.service"})
public class TcSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcSpringBootApplication.class, args);
	}
}
