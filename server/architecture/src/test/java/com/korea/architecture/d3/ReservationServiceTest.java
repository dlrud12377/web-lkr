package com.korea.architecture.d3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReservationServiceTest {

	@Autowired
	private ReservationService reservationService;
	
	@Test
	public void reservationTest() {
		reservationService.reserve();
	}
	
}
