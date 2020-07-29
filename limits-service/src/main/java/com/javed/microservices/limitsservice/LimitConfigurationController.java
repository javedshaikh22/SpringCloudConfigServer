package com.javed.microservices.limitsservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javed.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		//Hard coded value
		//return new LimitConfiguration(1000,1);
		
		//read value from property file
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
