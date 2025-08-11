package com.sb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment8 {
	public static void main(String[] args) {
        List<String> cities = Arrays.asList("Pune", "HYD", "Bombay");
        String result = cities.stream()
                              .collect(Collectors.joining(", "));
        System.out.println("Cities: " + result);
    }
}
