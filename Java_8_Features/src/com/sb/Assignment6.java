package com.sb;

import java.util.Arrays;
import java.util.List;

public class Assignment6 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Sunny", "Sanket", "Sam", "Aryan");
        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();
        System.out.println("Names longer than 5 chars: " + count);
    }
}
