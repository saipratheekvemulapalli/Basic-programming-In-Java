package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,160,7,8,22,14456,234,153,356);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,1,3,5,2,4,6,3,7,8,9,0,3);
		
		List<Integer> evenList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		//System.out.println(evenList);
		
		List<Integer> total = list.stream().map(n->n+1).collect(Collectors.toList());
		//System.out.println(total);
		
		int totall = list.stream().reduce(0,(a,b)->a/b);
		//System.out.println(totall);
		
		List<Integer> liststart1 = list.stream().filter(n->String.valueOf(n).endsWith("0")).map(n->n/10).collect(Collectors.toList());
		//System.out.println(liststart1);
		
		Set<Integer> set = new HashSet();
	List<Integer> lioo = list2.stream().filter(n->set.add(n)).collect(Collectors.toList());
		//System.out.println(set);
		
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1);

	        Set<Integer> unique = new HashSet<>();
	        List<Integer> duplicates = list2.stream()
	                .filter(n -> unique.add(n)) // If already present in unique set, it's a duplicate
	                .collect(Collectors.toList());

	        //System.out.println("Duplicate elements: " + duplicates);
	        String input = "Java articles are Awesome";


		    List result = input.chars() // Stream of String       
		            .mapToObj(s ->(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) //Store the chars in map with count 
		            .entrySet()
		            .stream()
		            .filter(entry -> entry.getValue() == 1L)
		            .map(entry -> entry.getKey())
		            //.findFirst()
		            .collect(Collectors.toList());
		//    System.out.println(result); 
		    
		    
		    
		    List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		     Map<String,Long> namesCount = names
		                             .stream()
		                             .collect(
		                              Collectors.groupingBy(
		                                Function.identity()
		                              , Collectors.counting()
		                              ));
		   
		
		
//		     List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
//			    List < String > uppercaseStrings = colors.stream()
//			      .map(String::toUpperCase)
//			      .collect(Collectors.toList());
//
//			    System.out.println("\nUppercase Strings: " + uppercaseStrings);
//			    System.out.println(colors);
//			    String string = String.join(",", colors);
//			    System.out.println("Comma separated String: "
//		                + string);
//			    List<String> strings = Arrays.asList("Java", "Python", "JavaScript", "C++", "Ruby", "Swift");
//
//		    String str1=    strings.stream()
//		                .max(Comparator.comparingInt(s->s.length())).orElse(null);
//		        		
//		    System.out.println(str1);

		       // System.out.println("Number of strings with length greater than 5: " + count);
		  
		
		
		
		
		    String input1 = "2,3,34,5,5,4,3,3,3";
		    List<Integer> list01 = Arrays.asList(1,2,3,4,5,6,5,4,2,1,4,5,7,111,11,1,1,1);
		    
		    
		    
		    Map<Integer,Long> map = list01.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		
		System.out.println(map);
		
		
		List<Integer> list011 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 2, 1, 4, 5, 7, 111, 11, 1, 1, 1);

        Map<Integer, Long> map1 = list011.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map1);
		
//        List<String> list829 = new ArrayList<>(List.of("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada"));

        //System.out.println(list829);
        
//      String res=  list829.stream().map(s->s.toUpperCase()).collect(Collectors.joining(","));
		
		//System.out.println(res);
		
		
		List<Integer> list1101 = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		int max = list1101.stream().min((a,b)->a.compareTo(b)).get();
		//System.out.println(max);
		
		
		int min1 = list1101.stream().sorted().skip(list1101.size()-1).findFirst().get();
		//System.out.println(min1);
		
      
		IntSummaryStatistics stats = list1101.stream().mapToInt(s->(int) s).summaryStatistics();
		
		System.out.println(stats.getCount());
		
		String str= "Capgeminic"; 
		str.toLowerCase();
		Map<Character, Long> result1 = str.toLowerCase().chars()
				
				.mapToObj(c->(char) c)
				
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  
		System.out.println(result1);  
		
		
//		List<Integer> list991 = Arrays.asList(1,2,3,4,5,6,1,10,4);
//		
//			int max1=	list991.stream().max(Integer::compareTo).get();
//		System.out.println(max1);
//		
//		int max2 = list991.stream().sorted().skip(list991.size()-1).findFirst().get();
//		System.out.println(max2);
//		
		 List<Integer> names1 = Arrays.asList(9,8,6,4,8,9,0,3,6);
	        Map<Integer,Long> namesCount1 = names1
	                                .stream()
	                                .collect(
	                                 Collectors.groupingBy(
	                                   s->(int)s,LinkedHashMap::new
	                                 , Collectors.counting()
	                                 ));
	        System.out.println(namesCount1);
	        
	        
//	        String[] nameArray = new String[] { "Peter", "Steves", "paul","Ramayan" };
	        
//	        List<String> listt = List.of(nameArray);
	        
//	        List<String> listo = listt.stream().map(n->n+"").filter(s->s.length()>5)
//									.collect(Collectors.toList());
	        
	        
	        
//	        System.out.println(listo);
	        
	        
	        
	}	
		
		
	
	

}
