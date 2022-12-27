package com.ilhan.basketball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@ComponentScan({"com.ilhan.controller","com.ilhan.service"})
@EntityScan("com.ilhan.entity")
@EnableNeo4jRepositories("com.ilhan.repository")
public class BasketballApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasketballApplication.class, args);
	}

}
