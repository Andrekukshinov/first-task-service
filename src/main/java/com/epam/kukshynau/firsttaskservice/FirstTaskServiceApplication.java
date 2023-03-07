package com.epam.kukshynau.firsttaskservice;

import com.epam.kukshynau.firsttaskservice.config.DatabesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import(DatabesConfig.class)
public class FirstTaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstTaskServiceApplication.class, args);
	}

}
