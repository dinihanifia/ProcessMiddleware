package com.svc.sesi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SvcSesiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcSesiApplication.class, args);
	}

}
