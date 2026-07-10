package com.example.demo.dependency.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class ComputerTest {

	private final Computer computer;
	
	// 생성자 주입
	public ComputerTest(Computer computer) {
		this.computer = computer;
	}
	
	@Test
	public void computerTest() {
		log.info(computer.getScreenWidth()+"");
	}
	
}
