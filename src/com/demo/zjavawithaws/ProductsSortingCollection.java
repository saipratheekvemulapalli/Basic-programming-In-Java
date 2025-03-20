package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsSortingCollection {

	public static void main(String[] args) {
		
List<Product> list = new ArrayList<>();
        
        list.add(new Product(1, "samsung"));
        list.add(new Product(2, "oppo"));
        list.add(new Product(3, "vivo"));
        list.add(new Product(4, "redmi"));
        list.add(new Product(5, "hawei"));
        list.add(new Product(6, "motorola"));
        list.add(new Product(7, "poco"));
        list.add(new Product(8, "iqoo"));
        list.add(new Product(9, "rog"));
        list.add(new Product(10, "oneplus"));
        
        // Sort list by productName
        List<Product> resultlist = list.stream().sorted().collect(Collectors.toList());
        System.out.println(resultlist);
	}

}
