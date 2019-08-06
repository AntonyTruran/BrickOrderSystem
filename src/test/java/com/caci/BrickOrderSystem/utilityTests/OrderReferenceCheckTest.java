package com.caci.BrickOrderSystem.utilityTests;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.caci.BrickOrderSystem.entities.BrickOrder;
import com.caci.BrickOrderSystem.utilities.OrderReferenceChecker;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderReferenceChecker.class)
public class OrderReferenceCheckTest {
	@InjectMocks
	OrderReferenceChecker checker;
	
	@Mock
	BrickOrder entity; 
	
	
	private static final BrickOrder VALID_REFERENCE = new BrickOrder("AA001", 10);
	private static final BrickOrder INVALID_REFERENCE = new BrickOrder("jacks", 5);
	private List<BrickOrder> orderList = new ArrayList<BrickOrder>();

	@Test
	public void uniqueTest() {
		Mockito.when(entity.getOrderList()).thenReturn(orderList);
		assertTrue(orderList.isEmpty());
		orderList.add(VALID_REFERENCE);
		assertTrue(orderList.get(0).toString().contains(VALID_REFERENCE.getOrderReference()));
		}
	
	@Test
	public void nonUniqueTest() {
		orderList.add(VALID_REFERENCE);
		assertEquals("Order reference is in use",orderList.contains(VALID_REFERENCE));
	}
}
