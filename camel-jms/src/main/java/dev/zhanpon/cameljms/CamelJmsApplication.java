package dev.zhanpon.cameljms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CamelJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelJmsApplication.class, args);
	}

}
