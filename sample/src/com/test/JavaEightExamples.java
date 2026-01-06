package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightExamples {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(4);
		list.add(62);
		list.add(91);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);//filter
		
		 List<String> names = Arrays.asList("John","Aople", "Jane", "Joke", "Jill", "Joe");

	      //  names.stream().filter(n ->n.startsWith("J")).map(String::toUpperCase).forEach(System.out::println);
	       // names.stream().filter(n ->n.charAt(1)=='o').map(String::toUpperCase).forEach(System.out::println);
	        
		 names.stream().filter(n-> n.startsWith("J")).forEach(System.out::println);
		 
		 names.stream().filter(n -> n.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		 
//	        for(String s : names)
//	        {
//	        	if(s.charAt(1)=='o')
//	        		System.out.println(s);
//	        }
		 
		List<Employee> ls = new ArrayList<>();
		
		ls.add(new Employee(12,"naveen",134232,"IT"));
		ls.add(new Employee(34,"subba",899,"HR"));
		ls.add(new Employee(98,"Nari",79999,"IT"));
		ls.add(new Employee(152,"Raj",134232,"IT"));
		ls.add(new Employee(1,"NMk",90,"Admin"));
		ls.add(new Employee(3,"IPK",467,"HR"));
		ls.add(new Employee(152,"Raj",7890,"Admin"));
		
//		Map<String, Object> secondHighestByDept = ls.stream()
//	            .collect(Collectors.groupingBy(
//	                Employee::getDepartment,
//	                Collectors.collectingAndThen(
//	                    Collectors.toList(),
//	                    l -> l.stream()
//	                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//	                        .skip(1) // skip highest
//	                        .findFirst()
//	                )
//	            ));
		
		;
		
		Map<String, Optional<Employee>> highestByDept = ls.stream().sorted()
	            .collect(Collectors.groupingBy(
	                Employee::getDepartment,
	                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
	            ));
    // ls.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary).reversed())));
	        // Print result
     
		ls.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
//ls.stream().sorted().collect(Collectors.groupingBy(Employee::getDepartment),Collectors.maxBy(Comparator.comparingDouble(Employee::)))
		
     ls.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary).reversed())));
     System.out.println(highestByDept+"***");
	        highestByDept.forEach((dept, emp) ->
	            System.out.println(dept + " => " + emp.map(Employee::toString).orElse("Not Found"))
    );

}
}
