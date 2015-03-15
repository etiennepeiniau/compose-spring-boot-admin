package com.peiniau.spring;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootAdminApplication.class, args);
	}

}
