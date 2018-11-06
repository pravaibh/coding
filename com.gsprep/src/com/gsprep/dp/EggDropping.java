package com.gsprep.dp;

public class EggDropping {
	
	/**
	 * Formula: for(x = 1 - n), calculate min[ max[(f - x , e - 1), (x - 1, e)] + 1]
	 * Soln.: store it in a 2D array i = 1 to f, j = 1 to e.
	 * @param floors
	 * @param eggs
	 * @return
	 */
	int[][] arr;
	int floors;
	int eggs;
	
	public EggDropping(int floors, int eggs) {
		arr = new int[floors][eggs];
		this.floors = floors;
		this.eggs = eggs;
	}
	
	public int calculateThresholdFloorWithMinAttempts() {
		
		return calculateRecursive();
	}

	private int calculateRecursive() {
		// TODO Auto-generated method stub
		return 0;
	}

}
