package com.tirmizee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.netflix.ribbon.RibbonProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.properties.RateLimitProperties;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.tirmizee.config.RibbonConfiguration;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringBootCloudZuulProxyApplication {

	public RateLimitProperties limitProperties;
	public RibbonProperties ribbonProperties;
	public AvailabilityFilteringRule availabilityFilteringRule;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudZuulProxyApplication.class, args);
	}

}
