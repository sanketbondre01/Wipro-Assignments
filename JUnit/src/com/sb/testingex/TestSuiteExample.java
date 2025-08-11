package com.sb.testingex;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

class TestSuite_Ex{
	
	 @Test
	    void greet() {
	        System.out.println("Ramesh");
	    }

	    @Test
	    void greet1() {
	        System.out.println("Suresh");
	    }

	    @Test
	    void greet2() {
	        System.out.println("Raju");
	    }
	    
	    @BeforeAll
	    static void greetBeforeAll() {
	        System.out.println("Hello");
	    }
}

@Suite
@SelectClasses({
	TestSuite_Ex.class
})

public class TestSuiteExample {
}