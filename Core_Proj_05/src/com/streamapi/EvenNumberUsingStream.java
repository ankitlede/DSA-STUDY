package com.streamapi;


import java.util.Arrays;
import java.util.List;


public class EvenNumberUsingStream {

	public static void main(String[] args) {
		
		
		  Integer arr[] ={10 ,15 ,25,23,24,26,28,55};
		
		    List<Integer> list = Arrays.asList( arr);
            list.stream().filter( n ->  n%2  ==  0).forEach(System.out::println);
            
            System.out.println("EvenNumberUsingStream.main()");
      
	}
	
	
}
