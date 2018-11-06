package com.gsprep.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class UniqueConnectionsInMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 0, 1 } };
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		for(int i = 0; i < 3; i++) {
			matrix.add(i, new ArrayList<>());
		}
		matrix.get(0).add(1);
		matrix.get(0).add(0);
		matrix.get(0).add(0);
		matrix.get(0).add(1);
		matrix.get(1).add(0);
		matrix.get(1).add(1);
		matrix.get(1).add(1);
		matrix.get(1).add(1);
		matrix.get(2).add(1);
		matrix.get(2).add(0);
		matrix.get(2).add(0);
		matrix.get(2).add(1);
		countConnections(matrix);

	}

	private static void countConnectionsWithExceptionsHandled(List<List<Integer>> matrix) {
		int c = 0;
		// do bfs
//		Queue<Coordinates> q = new LinkedList<>();
		int iMax = matrix.size() - 1;
		int jMax = matrix.get(0).size() - 1;
		for (int i = 0; i <= iMax; i++) {
			for (int j = 0; j <= jMax; j++) {
				if (matrix.get(i).get(j) == 1) {
					try {
						if (matrix.get(i).get(j - 1) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
					try {
						if (matrix.get(i).get(j + 1) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
					try {
						if (matrix.get(i - 1).get(j + 1) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
					try {
						if (matrix.get(i - 1).get(j - 1) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
					try {
						if (matrix.get(i - 1).get(j) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
					try {
						if (matrix.get(i + 1).get(j - 1) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
					try {
						if (matrix.get(i+1).get(j) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
					try {
						if (matrix.get(i+1).get(j+1) == 1) {
							c++;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
					}
				}
			}
		}
		System.out.println(c / 2);
	}

	private static void countConnections(List<List<Integer>> matrix) {
		int c = 0;
		int iMax = matrix.size() - 1;
		int jMax = matrix.get(0).size() - 1;
		for (int i = 0; i <= iMax; i++) {
			for (int j = 0; j <= jMax; j++) {
				if (matrix.get(i).get(j) == 1) {
					if (j - 1 >= 0 && matrix.get(i).get(j - 1) == 1) {
						c++;
					}
					if (j+1 <= jMax && matrix.get(i).get(j+1) == 1) {
						c++;
					}
					if (i -1 >=0 && j+1 <=jMax && matrix.get(i-1).get(j+1) == 1) {
						c++;
					}
					if (i -1 >=0 && j - 1 >= 0 && matrix.get(i-1).get(j-1) == 1) {
						c++;
					}
					if (i -1 >=0 && matrix.get(i-1).get(j) == 1) {
						c++;
					}
					if (i +1 <= iMax && j - 1 >= 0 && matrix.get(i+1).get(j-1) == 1) {
						c++;
					}
					if (i +1 <= iMax && matrix.get(i+1).get(j) == 1) {
						c++;
					}
					if (i +1 <= iMax && j+1<= jMax && matrix.get(i+1).get(j+1) == 1) {
						c++;
					}
				}
			}
		}
		System.out.println(c / 2);
	}
}


class Coordinates {
	int i;
	int j;

	Coordinates(int x, int y) {
		this.i = x;
		this.j = y;
	}
}
