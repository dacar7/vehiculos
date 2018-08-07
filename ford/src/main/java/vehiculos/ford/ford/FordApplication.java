package vehiculos.ford.ford;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FordApplication {

	public static void main(String[] args) {
		SpringApplication.run(FordApplication.class, args);
	}
}
