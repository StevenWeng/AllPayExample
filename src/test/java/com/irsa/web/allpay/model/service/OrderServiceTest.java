package com.irsa.web.allpay.model.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderServiceTest {
	OrderService orderService;

	@Before
	public void setUp() throws Exception {
		orderService = new OrderService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenerateTradeNo() {
		String result = orderService.generateTradeNo();
		assertEquals("test", result);
	}

}
