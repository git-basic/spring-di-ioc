package edu.sabanciuniv.iocdiexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocdiexampleApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(IocdiexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(userService.findAllUsers());
	}
}
