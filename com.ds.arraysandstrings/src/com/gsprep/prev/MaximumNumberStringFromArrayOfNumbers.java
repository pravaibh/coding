package com.gsprep.prev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumNumberStringFromArrayOfNumbers {
	public static void main(String[] args) {
		int arr[] = { 9, 21, 989, 9, 14, 32, 4, 3 };
		maxNumStringFromArray(arr);
	}

	static void maxNumStringFromArray(int[] arr) {

		List<Integer> ar = Arrays.stream(arr).boxed().collect(Collectors.toList());
		ar.sort((Integer a, Integer b) -> {
			String ab = a.toString().concat(b.toString());
			String ba = b.toString().concat(a.toString());
			return ba.compareTo(ab);
		});
		for (int t : ar) {
			System.out.print(t);
		}

	}
}
