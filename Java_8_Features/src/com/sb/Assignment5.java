package com.sb;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Abd", "Loki", "Jwssie", "Aandrew");
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .collect(Collectors.toList());
        System.out.println(result);
    }
} 
