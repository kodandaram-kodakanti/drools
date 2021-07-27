package io.javatechie.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.javatechie.model.Order;

@RestController
public class MegaFestiveOfferController {

	@Autowired
	private KieSession kieSession;

	/**
	 * 
	 * url: http://localhost:8080/order
	 * 
	 * body:
	 	{
		    "name":"Mobile",
		    "cardType":"HDFC",
		    "price":11000
		}
	 * 
	 * */
	
	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) {
		kieSession.insert(order);
		kieSession.fireAllRules();
		return order;
	}
}