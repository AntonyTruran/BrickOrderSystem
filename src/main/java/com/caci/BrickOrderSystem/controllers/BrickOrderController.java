package com.caci.BrickOrderSystem.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.caci.BrickOrderSystem.entities.BrickOrder;
import com.caci.BrickOrderSystem.service.BrickOrderService;

@RestController
public class BrickOrderController {
	public BrickOrderController(BrickOrderService service) {
		super();
		this.service = service;
	}

	private BrickOrderService service; 
	
	@PostMapping("/newOrder")
	public String newOrder(@RequestBody BrickOrder brickOrder) {
		return service.orderCheck(brickOrder);
	}
}
