package com.refab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication

@EntityScan("models")
@EnableJpaRepositories("repository")
public class MainCall {

	public static void main(String[] args) {
		SpringApplication.run(MainCall.class, args);
	}
                   
}