package vehiculos.motorsoft.motorsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MotorsoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotorsoftApplication.class, args);
	}
}
