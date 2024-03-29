package com.lbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
// war + Tomcat
//@SpringBootApplication
//public class WendaApplication extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(WendaApplication.class);
//	}
//	public static void main(String[] args) {
//		SpringApplication.run(WendaApplication.class, args);
//	}
//}

// jar directly to run
@SpringBootApplication
public class WendaApplication {
	public static void main(String[] args) {

		SpringApplication.run(WendaApplication.class, args);

	}
}