package com.scrum.besttrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
public class BesttripApplication {

	public static void main(String[] args) {

		SpringApplication.run(BesttripApplication.class, args);

	}

	@RequestMapping(value="/")
	public String homepage(){
		return "index";
	}
}
