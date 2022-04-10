package org.soham.projects.midtreeinternal.omf.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigServer
@Configuration
public class MC_ConfigEngine {

	public static void main(String[] args) {
		SpringApplication.run(MC_ConfigEngine.class, args);

	}

}
