package com.gsprep.prev;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class LargestSumContiguousSubarray {
  
  
  public static void main(String[] args) {
    int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    maxSumContiguousSubarray(arr);
  }
  
  static int maxSumContiguousSubarray(int [] arr) {
    
    int sum = 0;
    int max = 0;
    for(int i : arr) {
      sum+= i;
      if(sum < 0) {
        sum = 0;
      }
      if(max < sum) {
        max = sum;
      }
    }
    System.out.println(max);
    return max;
  }
}
