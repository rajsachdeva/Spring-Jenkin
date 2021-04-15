package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Test cases executing");
		System.out.println("Test cases executing again for confirm the build");
		assertEquals(true, true);
	}
}