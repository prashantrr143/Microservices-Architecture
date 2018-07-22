package in.prashant.microservices.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationRegistryServer {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplicationRegistryServer.class, args);
	}
}

/**
 * Added for debug support
 * 
 * @author prasingh26
 *
 */
@RestController
class ServiceInstanceRestController {

	@Autowired
	private org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;

	@GetMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}

	@GetMapping("/sevices")
	public List<String> serviceInstances() {
		return this.discoveryClient.getServices();
	}
}
