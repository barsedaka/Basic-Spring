package com.bar.basicspring;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class BasicspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicspringApplication.class, args);
	}

}
