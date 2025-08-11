package com.sb;

import java.util.Arrays;
import java.util.List;

public class Assignment11 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Sanket", "Sai", "Raj", "Aryan", "Vaish");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted Names: " + names);
    }
}
