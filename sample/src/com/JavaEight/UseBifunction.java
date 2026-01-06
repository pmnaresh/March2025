package com.JavaEight;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class UseBifunction {

	public static void main(String[] args) {

	
		  BiFunction<Integer,Integer,Integer> bi= (a,b)->a+b;
		  
		  System.out.println(bi.apply(3, 76));
	}

}
