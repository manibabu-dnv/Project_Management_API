package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Automatically scans com.example.demo and all subpackages
@ComponentScan(basePackages = "controllayer, Service, Repositry")
// Explicitly include the packages where your controllers, services, and repositories are located
public class ProjectmanagementapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectmanagementapiApplication.class, args);
	}
}
