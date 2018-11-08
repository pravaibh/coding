package com.gsprep.prev;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
//		Integer[] a = {1, 34, 3, 98, 9, 76, 45, 4};
//		printLargestPossibleNumberFormed(a);
		printFirstNonRepeatingCharacter("ses  quipedalian");
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
	
	private static void printFirstNonRepeatingCharacter(String s) {
		
		HashMap<Integer, NRChar> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(map.get((int) s.charAt(i)) == null) {
				map.put((int) s.charAt(i), new NRChar(i, 1));
			} else {
				NRChar nrc = map.get((int) s.charAt(i));
				nrc.count = nrc.count+1;
				map.put((int) s.charAt(i), nrc);
			}
		}
		for(char i : s.toCharArray()) {
			if(map.get((int) i).count == 1) {
				System.out.println(i);
				break;
			}
		}
	}
	
	
	
}

class NRChar {
	
	int index;
	int count;
	
	NRChar(int index, int count) {
		this.index = index;
		this.count = count;
	}
}
