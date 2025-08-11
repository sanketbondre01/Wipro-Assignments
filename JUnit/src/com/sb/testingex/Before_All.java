package com.sb.testingex;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Before_All {

    

    @Test
    void greet() {
        System.out.println("Sanket");
    }

    @Test
    void greet1() {
        System.out.println("Sandesh");
    }

    @Test
    void greet2() {
        System.out.println("Saurabh");
    }
    
    @BeforeAll
    static void greetBeforeAll() {
        System.out.println("Hello");
    }
}