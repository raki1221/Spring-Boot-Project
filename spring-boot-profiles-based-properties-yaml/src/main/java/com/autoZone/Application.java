package com.autoZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.autoZone.config.ServerProperties;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ServerProperties serverProperties;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(serverProperties);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
