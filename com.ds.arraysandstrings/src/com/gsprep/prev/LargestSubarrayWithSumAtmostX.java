package com.gsprep.prev;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class LargestSubarrayWithSumAtmostX {
  
  
  public static void main(String[] args) {
    int arr[] = {1, 2, 1, 0, 1, 1, 0};
    largestSubarrayWithSumAtmostX(arr, 4);
  }
  
  static void largestSubarrayWithSumAtmostX(int [] arr, int x) {
    
    //sliding window approach instead of a bruteforce n^2 approach.
    //take two pointers start and end. store end -start in a variable length. keep a sum variable. if sum > the value, do a start-- until it isn't keep track of end - start.
    int sum = 0;
    int end = 0;
    int start = 0;
    int si = 0;
    int length = 0;
    int maxL = 0;
    int n = arr.length;
    while (end < n) {
      while(sum <= x && end < n) {
        sum+= arr[end++];
        length = length < end -start? end - start: length;
      }
      while(sum > x && start < n) {
        sum-= arr[start++];
        length--;
      }
      if(maxL < length) {
        si = start;
        maxL = length;
      }
    }
    System.out.println(si);
    System.out.println(maxL);
    // } else {
    //   System.out.println("not possible");
    // }
   
    }
  }
