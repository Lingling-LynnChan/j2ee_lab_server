package cn.sc.czy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TravelGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelGatewayApplication.class, args);
	}

}
