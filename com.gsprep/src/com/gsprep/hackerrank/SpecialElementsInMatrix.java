package com.gsprep.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpecialElementsInMatrix {
	
	
	public static void main(String[] args) {
		int[][] arr = {{1,3,4},{5,2,9},{8,7,6},{2,4,11}};
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		for(int i = 0; i < 3; i++) {
			matrix.add(i, new ArrayList<>());
		}
		matrix.get(0).add(1);
		matrix.get(0).add(3);
		matrix.get(0).add(4);
		matrix.get(1).add(5);
		matrix.get(1).add(2);
		matrix.get(1).add(9);
		matrix.get(2).add(8);
		matrix.get(2).add(7);
		matrix.get(2).add(6);
		matrix.get(3).add(2);
		matrix.get(3).add(4);
		matrix.get(3).add(11);
		System.out.println(countSpecialElements(matrix));
	}

	private static int countSpecialElements(List<List<Integer>> matrix) {
		int[] rowsMin = new int[matrix.size()];
		int[] colsMin = new int[matrix.get(0).size()];
		int[] rowsMax = new int[matrix.size()];
		int[] colsMax = new int[matrix.get(0).size()];
		for(int i = 0; i < matrix.size(); i++) {
			for(int j = 0; j< matrix.get(0).size(); j++) {
				if(j == 0) {
					rowsMin[i] = matrix.get(i).get(j);
				}
				if(matrix.get(i).get(j) > rowsMax[i]) {
					rowsMax[i] = matrix.get(i).get(j);
				} else if(matrix.get(i).get(j) < rowsMin[i]) {
					rowsMin[i] = matrix.get(i).get(j);;
				} else if(matrix.get(i).get(j) == rowsMax[i] || matrix.get(i).get(j) == rowsMin[i]){
					return - 1;
				}
			}
		}
		for(int j = 0; j < matrix.get(0).size(); j++) {
			for(int i = 0; i< matrix.size(); i++) {
				if(i == 0) {
					colsMin[j] = matrix.get(i).get(j);
				}
				if(matrix.get(i).get(j) > colsMax[j]) {
					colsMax[j] = matrix.get(i).get(j);
				} else if(matrix.get(i).get(j) < colsMin[j]) {
					colsMin[j] = matrix.get(i).get(j);
				} else if(matrix.get(i).get(j) == colsMax[j] || matrix.get(i).get(j) == colsMin[j]){
					return - 1;
				}
			}
		}
		Set<Integer> s = new HashSet<>();
		for(int a : rowsMin) {
//			System.out.println(a);
			s.add(a);
		}
		for(int a : colsMin) {
//			System.out.println(a);
			s.add(a);
		}
		for(int a : rowsMax) {
//			System.out.println(a);
			s.add(a);
		}
		for(int a : colsMax) {
//			System.out.println(a);
			s.add(a);
		}
		return s.size();
	}
}
