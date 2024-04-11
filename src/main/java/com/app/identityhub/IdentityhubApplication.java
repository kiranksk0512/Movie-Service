package com.app.identityhub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class IdentityhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentityhubApplication.class, args);
	}

	@Bean
	public CommandLineRunner printApplicationContext(ApplicationContext applicationContext) {
		return args -> {
			System.out.println("These are the beans present in the application context");
			String[] beanNames = applicationContext.getBeanDefinitionNames();
			Arrays.stream(beanNames).forEach(bean -> System.out.println(bean + "\n"));
		};
	}

}
