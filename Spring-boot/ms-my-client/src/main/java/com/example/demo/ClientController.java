package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/client")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/demo")
	public String invoke()
	{
		return "Just For Demo";
	}
	
	@HystrixCommand(fallbackMethod = "xyz")
	@GetMapping("/callservice")
	public String invokeService()
	{
		String url="http://MY-SERVICE:8091";
		return restTemplate.getForObject(url, String.class);
	}
	
	public String xyz()
	{
		return "<h1>Sorry Service is down</h1><br><h3>Please try later</h3>";
	}
}	
