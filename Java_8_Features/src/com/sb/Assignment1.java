package com.sb;
import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
	        List<String> names = Arrays.asList("Virat", "ABD", "Smith", "Devid", "KLRahul");
	        names.sort((a, b) -> a.compareTo(b));
	        System.out.println("Sorted Names: " + names);
	    }
}
