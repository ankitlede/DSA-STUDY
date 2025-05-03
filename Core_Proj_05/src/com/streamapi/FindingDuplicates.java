package com.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FindingDuplicates {

	public static void getDuplicates(List<Integer> list) {
		System.out.println("FindingDuplicates.getDuplicates()");
		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	}

	public static void getWithoutDuplicates(List<Integer> list) {
		System.out.println("FindingDuplicates.getWithoutDuplicates()");
		list.stream().distinct().forEach(System.out::println);
	}

	public static void findFirstElement(List<Integer> list) {
		System.out.println("FindingDuplicates.findFirstElement()");
		Optional<Integer> first = list.stream().findFirst();
		first.stream().forEach(System.out::println);
	}

	public static void findTotalNumberOfElement(List<Integer> list) {
		System.out.println("FindingDuplicates.findTotalNumberOfElement()");
		long count = list.stream().count();
		System.out.println(count);
	}

	public static void getMaxElement(List<Integer> list) {
		System.out.println("FindingDuplicates.getMaxElement()");
		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);

	}
	
	public static void getFirstNonRepeatedCharacter(String s) {
		System.out.println("FindingDuplicates.getFirstNonRepeatedCharacter()");

		char[] input = s.toCharArray();

		int p1, p2;
		for (int i = 0; i < input.length; i++) {

			p1 = input[i];
			p2 = input[i++];

			if (input[p1] == input[p2]) {

				p1++;

			} else {

				System.out.println(p1);
				break;

			}
		}

	}

	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98,100, 32, 15);
		// getDuplicates(list);
		// getWithoutDuplicates(list);
		// findFirstElement(list);
		//findTotalNumberOfElement(list);
		//getMaxElement(list);
		
		//getFirstNonRepeatedCharacter("AnkitLede");
		
		
	}

}
