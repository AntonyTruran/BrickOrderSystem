package com.caci.BrickOrderSystem.service;

import org.springframework.stereotype.Service;

import com.caci.BrickOrderSystem.entities.BrickOrder;
import com.caci.BrickOrderSystem.repository.BrickOrderRepo;
import com.caci.BrickOrderSystem.utilities.OrderReferenceChecker;

@Service
public class BrickOrderService {

	private BrickOrderRepo repo;
	private OrderReferenceChecker checker;
	private BrickOrder entity;

	public String orderCheck(BrickOrder order) { 
		String checkResult = checker.validCheck(order);
		if (checkResult.equals("unique")) {
			newOrder(order);
			return order.getOrderReference();
		} else if (checkResult.equals("valid")) {
			return "Order reference is in use";
		} else {
			return "Invalid Reference";
		}
	}

	public BrickOrder newOrder(BrickOrder order) {
		this.repo.save(order);
		return order;
	}

}
