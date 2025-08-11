package com.sb.testingex;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;

public class Parameters_Test{
	
	@ParameterizedTest
	@CsvFileSource(resources="./Sample.txt")
		void testUsersfromFile(String name, int age) {
			assertNotNull(name);
			assertTrue(age>0);
		}
	
	@ParameterizedTest
	@EnumSource(Status.class)
		void testSatausNotNull(Status status)
		{
			assertNotNull(status);
		}enum Status
	{
	ACTIVE,
	INACTIVE
	}
	 
}