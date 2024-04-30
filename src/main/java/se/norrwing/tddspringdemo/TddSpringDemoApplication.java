package se.norrwing.tddspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TddSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddSpringDemoApplication.class, args);
	}


}

