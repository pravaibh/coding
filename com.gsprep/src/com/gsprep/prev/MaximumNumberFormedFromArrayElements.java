package com.gsprep.prev;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumberFormedFromArrayElements {

public static void main(String[] args) {
		
		Integer[] a = {1, 34, 3, 98, 9, 76, 45, 4};
		printLargestPossibleNumberFormed(a);
	}

	private static void printLargestPossibleNumberFormed(Integer[] a) {
		
		List<Integer> l = Arrays.asList(a);
		Collections.sort(l, (Integer p, Integer q) -> { 
			String pq = p.toString() + q.toString();
			String qp = q.toString() + p.toString();
			return qp.compareTo(pq);
		} );
		String s = "";
		for(Integer i : l) {
			s+= i.toString();
		}
		System.out.println(s);
	}
}
