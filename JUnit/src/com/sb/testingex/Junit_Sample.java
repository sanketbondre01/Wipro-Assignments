package com.sb.testingex;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Junit_Sample {

	@Test
	@DisplayName("Demo")

	
	void test() {
		System.out.println("Hello");
	}
	
	@Test
	
	void test2() {
		int av = 6;
		int ev = 7;
		int uv = 3;
		assertEquals(av, ev);
		assertNotEquals(uv, av);
	}

}