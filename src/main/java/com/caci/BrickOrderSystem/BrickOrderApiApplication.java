package com.caci.BrickOrderSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class BrickOrderApiApplication {
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BrickOrderApiApplication.class, args);
	}
}
