package com.caci.BrickOrderSystem.serviceTests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.Invocation;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import com.caci.BrickOrderSystem.controllers.BrickOrderController;
import com.caci.BrickOrderSystem.entities.BrickOrder;
import com.caci.BrickOrderSystem.repository.BrickOrderRepo;
import com.caci.BrickOrderSystem.service.BrickOrderService;

@RunWith(SpringRunner.class)
@WebMvcTest(BrickOrderService.class)
public class ServiceTest {
	@InjectMocks
	BrickOrderService service;

	@Mock
	BrickOrderRepo repo;

	private List<BrickOrder> orderList = new ArrayList<BrickOrder>();
	private static final BrickOrder MOCK_ORDER = new BrickOrder("AA001", 10);

	@Before
	public void setup() {
		orderList.add(MOCK_ORDER);
	}

	@Test
	public void newOrder() {
		BrickOrder newMockOrder = new BrickOrder("AA002", 2);

		Mockito.when(repo.save(newMockOrder)).thenReturn(newMockOrder);
		service.newOrder(newMockOrder);
//		Mockito.when(repo.findAll()).thenReturn(orderList);
		assertThat(orderList.contains(newMockOrder));
	}
}