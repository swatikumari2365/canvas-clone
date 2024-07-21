package com.swati.canvas_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.swati.canvas_clone")
@ComponentScan("com.swati.canvas_clone")
@EnableJpaRepositories("com.swati.canvas_clone")
public class CanvasCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanvasCloneApplication.class, args);
	}

}
