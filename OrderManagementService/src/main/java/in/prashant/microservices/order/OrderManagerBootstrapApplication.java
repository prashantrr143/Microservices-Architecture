package in.prashant.microservices.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OrderManagerBootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagerBootstrapApplication.class, args);
	}
}
