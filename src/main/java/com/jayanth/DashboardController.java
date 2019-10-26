package com.jayanth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class DashboardController {
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/dashboard")
	public String getTollRate(@RequestParam int stationId, Model m) {

		//RestTemplate restTemplate = new RestTemplate();
		TollRate tr = restTemplate.getForObject("http://"
				//+ "localhost:8085"
				+"toll-service-instance"
				+ "/tollrate/"+stationId	, TollRate.class);
		System.out.println("Station ID: "+ stationId);
		m.addAttribute("rate", tr.getCurrentRate());
		
		return "dashboard";
		
	}

}
