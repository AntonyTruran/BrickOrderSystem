package com.caci.BrickOrderSystem.controllerTests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.notNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.caci.BrickOrderSystem.controllers.BrickOrderController;
import com.caci.BrickOrderSystem.entities.BrickOrder;
import com.caci.BrickOrderSystem.service.BrickOrderService;

@RunWith(SpringRunner.class)
@WebMvcTest(BrickOrderController.class)
@AutoConfigureMockMvc
public class ControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BrickOrderService service;
	
	private static final BrickOrder NEW_ORDER = new BrickOrder("AAA001", 10);
	
	@Test
	public void testNewOrder() throws Exception {
		Mockito.when(service.newOrder((BrickOrder)notNull())).thenReturn(NEW_ORDER);
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/newOrder").param("orderReference", "AAA001").param("quantity", "10")).andReturn();
		assertThat(result.getResponse().getContentAsString().contains("order Created"));
	}
}
