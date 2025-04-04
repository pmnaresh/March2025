package com.practice.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashCodeEqaulsMethod {

	public static void main(String[] args) {

		Set<Product> products = new HashSet<>();

		for (int i = 0; i < 5; i++) {
			products.add(new Product(i, "Naresh", "MPL"));
		}
		products.add(new Product(13, "Suresh", "Angallu"));
		products.add(new Product(123, "kbbufda", "Bang"));
		products.add(new Product(13, "Suresh", "KVP"));
		products.add(new Product(13, "Suresh", "KTR"));
		products.add(new Product(13, "Suresh", "KTR"));
		
		
		
		for(Product pr: products)
		System.out.println(pr);
	}

}
