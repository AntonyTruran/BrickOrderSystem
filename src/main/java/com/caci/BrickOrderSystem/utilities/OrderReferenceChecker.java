package com.caci.BrickOrderSystem.utilities;

import java.util.ArrayList;
import java.util.List;

import com.caci.BrickOrderSystem.entities.BrickOrder;

public class OrderReferenceChecker {

	public List<BrickOrder> orderList = new ArrayList<BrickOrder>();
	public String validCheck(BrickOrder newOrder) {
		orderList.add(newOrder);
		String orderReference=newOrder.getOrderReference();
		for(BrickOrder order : orderList) {
			if (orderReference.equals(orderList.get(0).toString())) {
				return "Order reference is in use";
			}
			else if(orderReference.equals(orderList.get(0).toString())) {
				return "valid reference";
			}
		}
		return null;
	}

}
