package com.monTest1.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.context.annotation.ComponentScan;


@EnableJpaRepositories("com.monTest1.ex.repository")
@EntityScan("com.monTest1.ex.entity")
@SpringBootApplication
public class ExApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExApplication.class, args);
	}

}
