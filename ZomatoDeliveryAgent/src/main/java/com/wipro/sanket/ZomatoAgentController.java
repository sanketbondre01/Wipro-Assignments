package com.wipro.sanket;

import java.util.Map;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import lombok.RequiredArgsConstructor;
 
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/zomato/delivery")
public class ZomatoAgentController {
 
	private ZomatoAgentDeliveryService zomatoAgentDeliveryService;
	
	
	@PatchMapping("/getLocationOfDeliveryAgent")
	public Map<String,String> getUpdatedLocation() throws InterruptedException
	{	
		int range=100;
		
		while(range>0)
		{
			zomatoAgentDeliveryService.updateDeleiveryAgentLocation(Math.random()+","+Math.random());
			Thread.sleep(2000);
			range--;
		}
		return Map.of("message","Location Updated every Second");
		
	}
		
}
 
 
